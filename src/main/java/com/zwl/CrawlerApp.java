package com.zwl;

import cn.hutool.core.io.FileUtil;
import com.alibaba.fastjson.JSON;
import com.zwl.constant.ZhiHuConstant;
import com.zwl.model.Topic;
import com.zwl.process.*;
import com.zwl.util.TopicTree;
import lombok.extern.slf4j.Slf4j;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.handler.CompositePageProcessor;
import us.codecraft.webmagic.pipeline.ConsolePipeline;

import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

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
        .addPipeline(new ConsolePipeline())
        .runAsync();

    // 爬取话题及高赞回答
    String topicPath =
        ZhiHuConstant.PACKAGE_PATH + File.separator + "topic" + File.separator + "topic.json";
    File file = new File(topicPath);
    if (file.exists()) {
      return;
    }
    CompositePageProcessor compositePageProcessor =
        new CompositePageProcessor(
                Site.me()
                    .setDomain("zhihu.com")
                    .setRetryTimes(3)
                    .setCharset("utf-8")
                    .setTimeOut(10000))
            .setSubPageProcessors(
                new TopicProcess("https://www.zhihu.com/topics"),
                new SubTopicProcess(ZhiHuConstant.TOPIC_URL),
                new TopAnswerProcess(""),
                new AnswerPageProcess("https://www.zhihu.com/question/\\d+/answer/\\d+"));

    Spider.create(compositePageProcessor)
        .setPipelines(
            new ArrayList<>() {
              {
                add(new ConsolePipeline());
              }
            })
        // 话题广场
        .addUrl("https://www.zhihu.com/topics")
        .thread(Runtime.getRuntime().availableProcessors() * 6)
        .run();

    // 保存话题json文件
    CopyOnWriteArrayList<Topic> rootTopic = TopicTree.getRootTopic();
    FileUtil.writeUtf8String(JSON.toJSONString(rootTopic, true), topicPath);
  }
}
