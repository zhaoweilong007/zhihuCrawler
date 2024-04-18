package org.archive;

import cn.hutool.core.util.CharsetUtil;
import cn.hutool.http.HttpStatus;
import lombok.extern.slf4j.Slf4j;
import org.archive.constant.CrawlerConstants;
import org.archive.properties.CrawlerProperties;
import org.archive.properties.ProxyProperties;
import org.archive.properties.RedisProperties;
import redis.clients.jedis.JedisPool;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.downloader.Downloader;
import us.codecraft.webmagic.downloader.HttpClientDownloader;
import us.codecraft.webmagic.handler.CompositePageProcessor;
import us.codecraft.webmagic.handler.SubPageProcessor;
import us.codecraft.webmagic.proxy.Proxy;
import us.codecraft.webmagic.proxy.SimpleProxyProvider;
import us.codecraft.webmagic.scheduler.RedisPriorityScheduler;
import us.codecraft.webmagic.scheduler.Scheduler;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ZhaoWeiLong
 * @description
 **/
@Slf4j
public class ZhiHuCrawler {

    private CrawlerProperties properties;

    private Site site;

    private CompositePageProcessor processors;

    private final Scheduler scheduler;

    private final Downloader downloader;

    private int thread;

    public ZhiHuCrawler(CrawlerProperties properties) {
        Set<Integer> acceptCode = new HashSet<>() {
            {
                add(HttpStatus.HTTP_OK);
                add(HttpStatus.HTTP_NOT_FOUND);
                add(HttpStatus.HTTP_FORBIDDEN);
            }
        };
        this.properties = properties;
        this.site = Site.me()
                .setDomain(CrawlerConstants.DO_MAIN)
                .setCharset(CharsetUtil.UTF_8)
                .setAcceptStatCode(acceptCode);
        final RedisProperties redis = properties.getRedis();
        this.processors = new CompositePageProcessor(site);
        this.scheduler = new RedisPriorityScheduler(new JedisPool(redis.getHost(), redis.getPort(), null, redis.getPassword()));
        final ProxyProperties proxy = properties.getProxy();
        final HttpClientDownloader clientDownloader = new HttpClientDownloader();
        if (proxy.getEnable()) {
            clientDownloader.setProxyProvider(SimpleProxyProvider.from(proxy.getProxies().toArray(new Proxy[0])));
            this.thread = proxy.getProxies().size();
        } else {
            clientDownloader.setThread(1);
        }
        this.downloader = clientDownloader;
    }

    public void addSubPageProcessor(SubPageProcessor subPageProcessor) {
        this.processors.addSubPageProcessor(subPageProcessor);
    }


    public void run() {
        Spider.create(processors)
                .setScheduler(scheduler)
                .setDownloader(downloader)
                .thread(thread)
                .run();
    }


}
