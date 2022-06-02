package com.zwl;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.exceptions.ExceptionUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.IORuntimeException;
import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpStatus;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONWriter;
import com.zwl.constant.ZhiHuConstant;
import com.zwl.model.Topic;
import com.zwl.process.*;
import com.zwl.thread.CrawlerThreadPool;
import com.zwl.util.CrawlerUtils;
import com.zwl.util.TopicTree;
import lombok.extern.slf4j.Slf4j;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.handler.CompositePageProcessor;
import us.codecraft.webmagic.scheduler.FileCacheQueueScheduler;
import us.codecraft.webmagic.utils.HttpConstant;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static com.zwl.constant.ZhiHuConstant.*;

/**
 * 描述：爬虫入口
 *
 * @author zwl
 * @since 2022/5/20 15:16
 */
@Slf4j
public class CrawlerApp {

    public static final String COOKIE = System.getenv().get("COOKIE");
    public static final String ANSWER_FLAG = System.getenv().get("ANSWER_FLAG");

    public static void main(String[] args) {
        // 爬取知乎热榜
        Spider.create(new HotTopProcess())
                .addUrl(ZhiHuConstant.HOT_TOP_URL)
                .run();
        if (StrUtil.isEmpty(COOKIE)) {
            log.warn("请在环境变量配置cookie参数");
            return;
        }
        Boolean parseAnswer = Optional.ofNullable(ANSWER_FLAG).map(Boolean::valueOf).orElse(false);

        Spider spider = Spider.create(assemblyPage(COOKIE))
                .thread(Runtime.getRuntime().availableProcessors() << 5)
                .setScheduler(new FileCacheQueueScheduler(TMP_PATH));

        CrawlerUtils.setSpider(spider);

        log.info("《《《《《《《《《《《《《《《《开始爬取topic》》》》》》》》》》》》》》");
        if (!TopicTree.checkTopic()) {
            parseTopic(spider);
        }

        if (parseAnswer) {
            // 爬取话题下的问题
            parseTopicQuestion(spider, 3);
        }
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<<<<回答爬取全部结束>>>>>>>>>>>>>>>>>>>>>>>>");
    }


    /**
     * 爬取话题
     *
     * @param spider
     */
    public static void parseTopic(Spider spider) {
        ScheduledExecutorService scheduledThreadPool = Executors.newSingleThreadScheduledExecutor();
        scheduledThreadPool.scheduleWithFixedDelay(() -> {
            // 保存话题json文件
            try {
                FileUtil.writeUtf8String(JSON.toJSONString(TopicTree.getRootTopic(), JSONWriter.Feature.PrettyFormat), ZhiHuConstant.TOPIC_PATH);
                List<Topic> topics = TopicTree.TOPIC_LIST.stream().filter(topic -> topic.getFollowers() != null && topic.getFollowers() > 20000).peek(topic -> topic.setSubTopics(null)).toList();
                FileUtil.writeUtf8String(JSON.toJSONString(topics, JSONWriter.Feature.PrettyFormat), PACKAGE_PATH + File.separator + "topic" + File.separator + "heightTopics.json");
            } catch (IORuntimeException e) {
                log.error("保存数据文件失败：{}", ExceptionUtil.stacktraceToString(e));
            }
        }, 1, 1, TimeUnit.MINUTES);
        TopicTree.setRootTopic(new CopyOnWriteArrayList<>() {{
            add(new Topic()
                    .setTopicId(19776749L)
                    .setTopicName("根话题")
                    .setParentId(0L));
        }});
        Request request = new Request("https://www.zhihu.com/topic/19776749/organize");
        request.addCookie("z_c0", COOKIE);
        spider.addRequest(request).run();
        scheduledThreadPool.shutdown();
        log.info("《《《《《《《《《《《《《《topic爬取完成，开始写入topic文件》》》》》》》》》》》》》》");
    }


    /**
     * 爬取话题下高赞回答
     *
     * @param spider
     * @param threadNum 线程数 目前设置并发为2
     */
    private static void parseTopicQuestion(Spider spider, Integer threadNum) {
        spider.setExecutorService(new CrawlerThreadPool(threadNum));
        String json = FileUtil.readUtf8String(PACKAGE_PATH + File.separator + "topic" + File.separator + "heightTopics.json");
        List<Topic> list = JSON.parseArray(json, Topic.class);
        //按热度排序，优先爬取热度高的话题
        list.sort(Comparator.comparingLong(Topic::getFollowers).reversed());
        list.forEach(topic -> spider.addUrl(ZhiHuConstant.ANSWER_URL.formatted(topic.getTopicId(), 0)));
        spider.run();
    }


    /**
     * 递归添加请求
     *
     * @param topics
     * @param heightTopics
     */
    private static void forEachAddRequest(CopyOnWriteArrayList<Topic> topics, CopyOnWriteArrayList<Topic> heightTopics) {
        if (CollectionUtil.isEmpty(topics)) {
            return;
        }
        topics.stream()
                .filter(topic -> topic.getFollowers() > 10000)
                .forEach(topic -> {
                    heightTopics.add(topic);
                    if (CollectionUtil.isNotEmpty(topic.getSubTopics())) {
                        forEachAddRequest(topic.getSubTopics(), topics);
                    }
                });
    }

    /**
     * 不基于cookie爬取话题
     *
     * @return
     */
    private static CompositePageProcessor assemblyPage() {
        // 创建复合页面
        return
                new CompositePageProcessor(
                        Site.me()
                                .setDomain("zhihu.com")
                                .setRetryTimes(3).setCycleRetryTimes(3)
                                .setCharset(StandardCharsets.UTF_8.toString())
                                .setTimeOut(10000)
                                .setAcceptStatCode(
                                        new HashSet<Integer>() {
                                            {
                                                add(HttpConstant.StatusCode.CODE_200);
                                                add(HttpStatus.HTTP_NOT_FOUND);
                                                add(HttpStatus.HTTP_FORBIDDEN);
                                            }
                                        }))
                        .setSubPageProcessors(
                                new TopicProcess(TOPICS_PAGE_URL),
                                new SubTopicProcess(TOPIC_URL),
                                new TopAnswerProcess(ANSWER_PATTERN),
                                new AnswerPageProcess(ANSWER_PAGE_PATTERN));
    }

    /**
     * 基于cookie爬取话题
     *
     * @param cookie
     * @return
     */
    private static CompositePageProcessor assemblyPage(String cookie) {
        // 创建复合页面
        return
                new CompositePageProcessor(
                        Site.me()
                                .setDomain("zhihu.com")
                                .setRetryTimes(3).setCycleRetryTimes(3)
                                .setCharset(StandardCharsets.UTF_8.toString())
                                .setTimeOut(10000)
                                .setAcceptStatCode(
                                        new HashSet<Integer>() {
                                            {
                                                add(HttpConstant.StatusCode.CODE_200);
                                                add(HttpStatus.HTTP_NOT_FOUND);
                                                add(HttpStatus.HTTP_FORBIDDEN);
                                            }
                                        }))
                        .setSubPageProcessors(
                                new TopicPageProcess(TOPIC_PAGE_PATTERN, cookie),
                                new SubTopicProcess(TOPIC_URL),
                                new TopAnswerProcess(ANSWER_PATTERN),
                                new AnswerPageProcess(ANSWER_PAGE_PATTERN));
    }


}
