package org.archive.listener;

import lombok.RequiredArgsConstructor;
import org.archive.constant.CrawlerConstants;
import org.archive.utils.RedisUtil;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.SpiderListener;

/**
 * 监听器 成功和失败的请求将被记录到Redis中
 *
 * @author ZhaoWeiLong
 **/
@RequiredArgsConstructor
public class RedisMonitorSpiderListener implements SpiderListener {

    @Override
    public void onSuccess(Request request) {
        RedisUtil.incr(CrawlerConstants.CRAWLER_SUCCESS_COUNT);
    }

    @Override
    public void onError(Request request, Exception e) {
        RedisUtil.incr(CrawlerConstants.CRAWLER_ERROR_COUNT);
        RedisUtil.rpush(CrawlerConstants.CRAWLER_ERROR_QUEUE, request.getUrl());
    }
}
