package org.archive;

import cn.hutool.core.util.CharsetUtil;
import cn.hutool.core.util.PageUtil;
import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import cn.hutool.db.handler.BeanListHandler;
import cn.hutool.http.HttpStatus;
import lombok.extern.slf4j.Slf4j;
import org.archive.constant.CrawlerConstants;
import org.archive.model.Topic;
import org.archive.properties.CrawlerProperties;
import org.archive.properties.ProxyProperties;
import org.archive.properties.RedisProperties;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.downloader.Downloader;
import us.codecraft.webmagic.downloader.HttpClientDownloader;
import us.codecraft.webmagic.handler.CompositePageProcessor;
import us.codecraft.webmagic.handler.SubPageProcessor;
import us.codecraft.webmagic.proxy.Proxy;
import us.codecraft.webmagic.proxy.SimpleProxyProvider;
import us.codecraft.webmagic.scheduler.RedisPriorityScheduler;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author ZhaoWeiLong
 * @description
 **/
@Slf4j
public class ZhiHuCrawler {

    private CompositePageProcessor processors;

    private final RedisPriorityScheduler scheduler;

    private final Downloader downloader;

    private int thread;

    private final Jedis jedis;

    private final Db db;

    public ZhiHuCrawler(CrawlerProperties properties) {
        Set<Integer> acceptCode = new HashSet<>() {
            {
                add(HttpStatus.HTTP_OK);
                add(HttpStatus.HTTP_NOT_FOUND);
                add(HttpStatus.HTTP_FORBIDDEN);
            }
        };
        this.processors = new CompositePageProcessor(Site.me()
                .setDomain(CrawlerConstants.DO_MAIN)
                .setCharset(CharsetUtil.UTF_8)
                .setAcceptStatCode(acceptCode));
        final JedisPool jedisPool = initJedis(properties.getRedis());
        this.jedis = jedisPool.getResource();
        this.scheduler = new RedisPriorityScheduler(jedisPool);
        this.downloader= initProxy(properties);
        this.db = Db.use();
    }

    private HttpClientDownloader initProxy(CrawlerProperties properties) {
        final ProxyProperties proxy = properties.getProxy();
        final HttpClientDownloader clientDownloader = new HttpClientDownloader();
        if (proxy.getEnable()) {
            clientDownloader.setProxyProvider(SimpleProxyProvider.from(proxy.getProxies().toArray(new Proxy[0])));
            this.thread = proxy.getProxies().size();
        } else {
            clientDownloader.setThread(1);
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
        final Spider spider = Spider.create(processors)
                .setScheduler(scheduler)
                .setDownloader(downloader)
                .thread(thread);

        final String initKey = jedis.get(CrawlerConstants.INIT_TOPIC_KEY);
        if (initKey == null) {
            //init request
            final Entity entity = Entity.parseWithUnderlineCase(Topic.class);
            final long count = db.count(entity);
            if (count == 0) {
                throw new RuntimeException("topic table is empty,place run sql script first");
            }
            for (int i = 0; i < PageUtil.totalPage(count, 1000); i++) {
                final List<Topic> topics = db.page(entity, 0, 1000, BeanListHandler.create(Topic.class));
                final Request[] requests = topics.stream()
                        .map(topic -> new Request(CrawlerConstants.TOP_ACTIVITY_URL.formatted(topic.getTopicId())))
                        .toArray(Request[]::new);
                spider.addRequest(requests);
                log.info("init request finish total request:{}", count);
            }
        }
        spider.run();
    }


}
