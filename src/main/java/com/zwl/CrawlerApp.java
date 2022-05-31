package com.zwl;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.exceptions.ExceptionUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.IORuntimeException;
import cn.hutool.core.util.ArrayUtil;
import cn.hutool.http.HttpStatus;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONWriter;
import com.zwl.constant.ZhiHuConstant;
import com.zwl.model.Topic;
import com.zwl.process.*;
import com.zwl.util.TopicTree;
import lombok.extern.slf4j.Slf4j;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.handler.CompositePageProcessor;
import us.codecraft.webmagic.utils.HttpConstant;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
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

    public static void main(String[] args) {
        // 爬取知乎热榜
        Spider.create(new HotTopProcess())
                .addUrl(ZhiHuConstant.HOT_TOP_URL)
                .run();

        log.info("输入参数：{}", Arrays.toString(args));
        if (ArrayUtil.isEmpty(args)) {
            log.warn("请配置cookie参数");
            return;
        }

        String cookie = args[0];
        Spider spider = Spider.create(assemblyPage(cookie))
                //.addUrl(TOPICS_PAGE_URL)
                .thread(200);
        //spider.setSpiderListeners(new ArrayList<>() {{
        //    add(new CrawlerListener(spider));
        //}});

        log.info("《《《《《《《《《《《《《《《《开始爬取topic》》》》》》》》》》》》》》");
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(2);
        if (!TopicTree.checkTopic()) {
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
            request.addCookie("z_c0", cookie);
            spider.addRequest(request).run();

            log.info("《《《《《《《《《《《《《《topic爬取完成，开始写入topic文件》》》》》》》》》》》》》》");

            // 爬取话题下的问题
            parseTopicQuestion(spider, 2);
            log.info("<<<<<<<<<<<<<<<<<<<<<<<<<<<回答爬取全部结束>>>>>>>>>>>>>>>>>>>>>>>>");
        }
        scheduledThreadPool.shutdown();
    }

    private static void parseTopicQuestion(Spider spider, Integer threadNum) {
        spider.thread(threadNum);
        //开始爬取高赞回答
        String json = FileUtil.readUtf8String(PACKAGE_PATH + File.separator + "topic" + File.separator + "heightTopics.json");
        List<Topic> list = JSON.parseArray(json, Topic.class);
        list.sort(Comparator.comparingLong(Topic::getTopicId));
        //每次最多爬取十个话题
        int fromIndex = 0;
        int lastIndex = list.size() - 1;
        while (true) {
            int nextIndex;
            if (fromIndex == lastIndex) {
                break;
            } else if (lastIndex - fromIndex < threadNum) {
                nextIndex = fromIndex + (lastIndex - fromIndex);
            } else {
                nextIndex = fromIndex + threadNum;
            }
            log.info("开始爬取topic：{}-{}", fromIndex, nextIndex);
            List<Topic> topics = list.subList(fromIndex, nextIndex);
            topics.forEach(topic -> {
                TopicTree.getTopicMap().putIfAbsent(topic.getTopicId(), topic);
                spider.addUrl(ZhiHuConstant.ANSWER_URL.formatted(topic.getTopicId(), 0));
            });
            spider.run();
            log.info("爬取完成topic：{}-{}", fromIndex, nextIndex);
            fromIndex = nextIndex;
        }
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
