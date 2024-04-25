package org.archive;

import cn.hutool.core.util.CharsetUtil;
import cn.hutool.core.util.PageUtil;
import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import cn.hutool.db.Page;
import cn.hutool.db.ds.DSFactory;
import cn.hutool.db.handler.BeanListHandler;
import cn.hutool.db.sql.Direction;
import cn.hutool.db.sql.Order;
import cn.hutool.http.HttpStatus;
import lombok.extern.slf4j.Slf4j;
import org.archive.constant.CrawlerConstants;
import org.archive.listener.RedisMonitorSpiderListener;
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
import us.codecraft.webmagic.SpiderListener;
import us.codecraft.webmagic.downloader.Downloader;
import us.codecraft.webmagic.downloader.HttpClientDownloader;
import us.codecraft.webmagic.handler.CompositePageProcessor;
import us.codecraft.webmagic.handler.SubPageProcessor;
import us.codecraft.webmagic.scheduler.RedisPriorityScheduler;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * 知乎爬虫
 *
 * @author ZhaoWeiLong
 **/
@Slf4j
public class ZhiHuCrawler {

    private final RedisPriorityScheduler scheduler;
    private final Downloader downloader;
    private final JedisPool jedisPool;
    private final DataSource dataSource;
    private final CompositePageProcessor processors;
    /**
     * 线程数 默认固定为1，如果开启代理，则线程数等于代理数
     */
    private final Integer thread;
    private final SpiderListener spiderListener;
    private final OssClient ossClient;
    private final CrawlerProperties properties;

    public ZhiHuCrawler(CrawlerProperties properties) {
        Set<Integer> acceptCode = new HashSet<>() {
            {
                add(HttpStatus.HTTP_OK);
                add(HttpStatus.HTTP_FORBIDDEN);
            }
        };
        this.properties = properties;
        this.processors = new CompositePageProcessor(Site.me()
                .setSleepTime(properties.getThread().getSleepTime())
                .setDomain(CrawlerConstants.DO_MAIN)
                .setCharset(CharsetUtil.UTF_8)
                .setAcceptStatCode(acceptCode)
        );
        this.jedisPool = initJedis(properties.getRedis());
        this.scheduler = new RedisPriorityScheduler(jedisPool);
        RedisUtil.setJedisPool(jedisPool);
        this.spiderListener = new RedisMonitorSpiderListener();
        this.downloader = initProxy(properties);
        this.thread = properties.getProxy().getEnable() ? properties.getProxy().getPools().size() : 1;
        this.dataSource = DSFactory.get();
        if (properties.getOss().getEnable()) {
            this.ossClient = new OssClient(properties.getOss());
        } else {
            this.ossClient = null;
        }

    }

    private HttpClientDownloader initProxy(CrawlerProperties properties) {
        final ProxyProperties proxy = properties.getProxy();
        final HttpClientDownloader clientDownloader = new HttpClientDownloader();
        if (proxy.getEnable()) {
            clientDownloader.setProxyProvider(DynamicProxyProvider.from(proxy));
        }
        return clientDownloader;
    }

    private JedisPool initJedis(RedisProperties redis) {
        final JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxIdle(redis.getMaxIdle());
        poolConfig.setMinIdle(redis.getMinIdle());
        poolConfig.setMaxTotal(redis.getMaxTotal());
        return new JedisPool(poolConfig, redis.getHost(), redis.getPort(), redis.getTimeout(), redis.getUsername(), redis.getPassword(), redis.getDatabase());
    }

    public void addSubPageProcessor(SubPageProcessor subPageProcessor) {
        this.processors.addSubPageProcessor(subPageProcessor);
    }


    public void run() throws Exception {
        EntityUtils.init(properties.getThread());
        final Spider spider = Spider.create(processors)
                .setSpawnUrl(true)
                .setScheduler(scheduler)
                .setDownloader(downloader)
                .setSpiderListeners(List.of(spiderListener))
                .thread(thread);
        //init topic
        initTopic(spider);
        spider.run();
    }


    /**
     * 从db读取所有topic写入redis队列
     */
    private void initTopic(Spider spider) throws SQLException {
        final String initKey = RedisUtil.get(CrawlerConstants.INIT_TOPIC_KEY);
        if (initKey != null && Objects.equals(Boolean.TRUE.toString(), initKey)) {
            return;
        }
        //init request
        final Entity entity = Entity.parseWithUnderlineCase(new Topic());
        final long count = Db.use().count(entity);
        if (count == 0) {
            throw new RuntimeException("topic table is empty,place run sql script first");
        }
        for (int i = 0; i < PageUtil.totalPage(count, 10000); i++) {
            final Page page = Page.of(i, 10000);
            page.setOrder(new Order("followers", Direction.DESC));
            final List<Topic> topics = Db.use().page(entity, page, BeanListHandler.create(Topic.class));
            final Request[] requests = topics.stream()
                    .map(topic -> {
                        final Request request = new Request(CrawlerConstants.TOP_ACTIVITY_URL.formatted(topic.getTopicId(), 0, topic.getFollowers()));
                        request.setPriority(topic.getFollowers());
                        return request;
                    })
                    .toArray(Request[]::new);
            spider.addRequest(requests);
        }
        RedisUtil.set(CrawlerConstants.INIT_TOPIC_KEY, Boolean.TRUE.toString());
        log.info("init request finish total request:{}", count);
    }
}
