package org.archive.listener;

import lombok.RequiredArgsConstructor;
import org.archive.constant.CrawlerConstants;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.SpiderListener;

/**
 * 监听器 成功和失败的请求将被记录到Redis中
 *
 * @author ZhaoWeiLong
 * @since 2024/4/23
 **/
@RequiredArgsConstructor
public class RedisMonitorSpiderListener implements SpiderListener {

    private final JedisPool jedisPool;


    @Override
    public void onSuccess(Request request) {
        try (Jedis jedis = jedisPool.getResource()) {
            jedis.incr(CrawlerConstants.CRAWLER_SUCCESS_COUNT);
        }
    }

    @Override
    public void onError(Request request, Exception e) {
        try (Jedis jedis = jedisPool.getResource()) {
            jedis.incr(CrawlerConstants.CRAWLER_ERROR_COUNT);
            jedis.rpush(CrawlerConstants.CRAWLER_ERROR_QUEUE, request.getUrl());
        }
    }
}
