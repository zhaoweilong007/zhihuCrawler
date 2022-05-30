package com.zwl.listener;

import com.zwl.process.TopicPageProcess;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.SpiderListener;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.regex.Pattern;

import static com.zwl.constant.ZhiHuConstant.TOPIC_PAGE_PATTERN;
/**
 * 描述：
 *
 * @author zwl
 * @since 2022/5/30 10:01
 **/
public class CrawlerListener implements SpiderListener {

    private final Spider spider;
    private final Map<Pattern, SpiderListener> patterns=new LinkedHashMap<>(){{
        put(Pattern.compile(TOPIC_PAGE_PATTERN), new SpiderListener() {

            private final Semaphore semaphore=new Semaphore(3);


            @Override
            public void onSuccess(Request request) {
                semaphore.release();
                try {
                    addReq();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            @Override
            public void onError(Request request) {
                semaphore.release();
                try {
                    addReq();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }


            private void addReq() throws InterruptedException {
                //添加下一个请求
                Request request = TopicPageProcess.topic_page_reqs.poll();
                if (request!=null) {
                    semaphore.acquire();
                    spider.addRequest(request);
                }
            }
        });
    }};

    public CrawlerListener(Spider spider) {
        this.spider = spider;
    }

    @Override
    public void onSuccess(Request request) {
        patterns.keySet().forEach(pattern -> {
            if (pattern.matcher(request.getUrl()).matches()){
                patterns.get(pattern).onSuccess(request);
            }
        });
    }

    @Override
    public void onError(Request request) {
        patterns.keySet().forEach(pattern -> {
            if (pattern.matcher(request.getUrl()).matches()){
                patterns.get(pattern).onError(request);
            }
        });
    }

}
