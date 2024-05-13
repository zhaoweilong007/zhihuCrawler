package org.archive;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.core.lang.Assert;
import cn.hutool.core.util.BooleanUtil;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.core.util.PageUtil;
import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import cn.hutool.db.Page;
import cn.hutool.db.handler.BeanListHandler;
import cn.hutool.db.sql.Direction;
import cn.hutool.db.sql.Order;
import cn.hutool.http.HttpStatus;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.TypeReference;
import java.io.BufferedReader;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import lombok.extern.slf4j.Slf4j;
import org.archive.constant.CrawlerConstants;
import org.archive.model.Topic;
import org.archive.oss.OssClient;
import org.archive.properties.CrawlerProperties;
import org.archive.properties.ProxyProperties;
import org.archive.properties.RedisProperties;
import org.archive.proxy.DynamicProxyProvider;
import org.archive.utils.EntityUtils;
import org.archive.utils.RedisUtil;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.downloader.HttpClientDownloader;
import us.codecraft.webmagic.handler.CompositePageProcessor;
import us.codecraft.webmagic.handler.SubPageProcessor;
import us.codecraft.webmagic.scheduler.RedisPriorityScheduler;

/**
 * 知乎爬虫
 *
 * @author ZhaoWeiLong
 **/
@Slf4j
public class ZhiHuSpider extends Spider {

  private final OssClient ossClient;
  private final CrawlerProperties properties;

  public ZhiHuSpider(CrawlerProperties properties) {
    super(new CompositePageProcessor(Site.me()
        .setSleepTime(properties.getThread().getSleepTime())
        .setDomain(CrawlerConstants.DO_MAIN)
        .setCharset(CharsetUtil.UTF_8)
        .setTimeOut(3000)
        .setAcceptStatCode(new HashSet<>() {
          {
            add(HttpStatus.HTTP_OK);
            add(HttpStatus.HTTP_FORBIDDEN);
          }
        })
    ));
    this.properties = properties;
    final JedisPool jedisPool = initJedis(properties.getRedis());
    RedisUtil.setJedisPool(jedisPool);
    this.scheduler = new RedisPriorityScheduler(jedisPool);
    this.downloader = initDownload(properties.getProxy());
    this.threadNum =
        properties.getProxy().getEnable() ? properties.getProxy().getPools().size() : 1;
    if (BooleanUtil.isTrue(properties.getOss().getEnable())) {
      this.ossClient = new OssClient(properties.getOss());
    } else {
      this.ossClient = null;
    }
    EntityUtils.init(properties.getThread());
  }

  private HttpClientDownloader initDownload(ProxyProperties proxy) {
    final HttpClientDownloader clientDownloader = new HttpClientDownloader();
    if (BooleanUtil.isTrue(proxy.getEnable())) {
      Assert.notEmpty(proxy.getPools(), "proxy pool is empty");
      clientDownloader.setProxyProvider(DynamicProxyProvider.from(proxy));
    }
    return clientDownloader;
  }

  private JedisPool initJedis(RedisProperties redis) {
    Assert.notBlank(redis.getHost(), "redis host is empty");
    Assert.notNull(redis.getPort(), "redis port is empty");
    final JedisPoolConfig poolConfig = new JedisPoolConfig();
    poolConfig.setMaxIdle(redis.getMaxIdle());
    poolConfig.setMinIdle(redis.getMinIdle());
    poolConfig.setMaxTotal(redis.getMaxTotal());
    return new JedisPool(poolConfig, redis.getHost(), redis.getPort(), redis.getTimeout(),
        redis.getUsername(), redis.getPassword(), redis.getDatabase());
  }

  public ZhiHuSpider addSubPageProcessor(SubPageProcessor subPageProcessor) {
    final CompositePageProcessor compositePageProcessor = (CompositePageProcessor) this.pageProcessor;
    compositePageProcessor.addSubPageProcessor(subPageProcessor);
    return this;
  }

  public static ZhiHuSpider create(CrawlerProperties properties) {
    return new ZhiHuSpider(properties);
  }

  @Override
  public void run() {
    try {
      //init topic
      initTopic();
      //读取失败队列的
      String url;
      while ((url = RedisUtil.poll(CrawlerConstants.CRAWLER_ERROR_QUEUE)) != null) {
        addUrl(url);
      }
      super.run();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }


  /**
   * 从db读取所有topic写入redis队列
   */
  private void initTopic() throws SQLException {
    final Entity entity = Entity.parseWithUnderlineCase(new Topic());
    final Db database = Db.use();

    final long total = database.count(entity);
    if (total == 0) {
      log.info("topic count is empty,init topic from file");
      final BufferedReader reader = ResourceUtil.getUtf8Reader(CrawlerConstants.TOPIC_PATH);
      CopyOnWriteArrayList<Topic> topics =
          JSON.parseObject(reader,
              new TypeReference<CopyOnWriteArrayList<Topic>>() {
              }.getType());
      final LinkedList<Entity> entities = new LinkedList<>();
      forEachAddRequest(topics, entities);
      database.insert(entities);
      log.info("init topic from file success");
    }

    final String initKey = RedisUtil.get(CrawlerConstants.INIT_TOPIC_KEY);
    if (initKey != null && Objects.equals(Boolean.TRUE.toString(), initKey)) {
      log.info("Already initialized topic");
      return;
    }
    //init request
    log.info("Initialization topic");
    final long count = database.count(entity);
    if (count == 0) {
      throw new RuntimeException("topic table is empty,place run sql script first");
    }
    for (int i = 0; i < PageUtil.totalPage(count, 10000); i++) {
      final Page page = Page.of(i, 10000);
      page.setOrder(new Order("followers", Direction.DESC));
      final List<Topic> topics = database.page(entity, page, BeanListHandler.create(Topic.class));
      final Request[] requests = topics.stream()
          .map(topic -> {
            final Request request = new Request(
                CrawlerConstants.TOP_ACTIVITY_URL.formatted(topic.getTopicId(), 0));
            final long priority = topic.getFollowers() == null ? 0 : topic.getFollowers();
            request.setPriority(priority);
            return request;
          })
          .toArray(Request[]::new);
      addRequest(requests);
    }
    RedisUtil.set(CrawlerConstants.INIT_TOPIC_KEY, Boolean.TRUE.toString());
    log.info("Initialization complete total request:{}", count);
  }


  /**
   * 递归添加请求
   *
   * @param topics
   */
  private static void forEachAddRequest(CopyOnWriteArrayList<Topic> topics,
      LinkedList<Entity> linkedList) {
    if (CollectionUtil.isEmpty(topics)) {
      return;
    }
    topics.forEach(topic -> {
      topic.setTopicName(topic.getTopicName().trim());
      if (topic.getFollowers() == null) {
        topic.setFollowers(0L);
      }
      linkedList.add(Entity.parse(topic, true, false));
      if (CollectionUtil.isNotEmpty(topic.getSubTopics())) {
        forEachAddRequest(topic.getSubTopics(), linkedList);
      }
    });
  }

  @Override
  protected void onError(Request request, Exception e) {
    sleep(site.getSleepTime());
    super.onError(request, e);
  }


}
