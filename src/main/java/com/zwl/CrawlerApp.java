package com.zwl;

import cn.hutool.core.io.FileUtil;
import cn.hutool.http.HttpStatus;
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
import us.codecraft.webmagic.utils.HttpConstant;

import java.util.HashSet;
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

    // 创建复合页面
    CompositePageProcessor compositePageProcessor =
        new CompositePageProcessor(
                Site.me()
                    .setDomain("zhihu.com")
                    .setRetryTimes(3)
                    .setCharset("utf-8")
                    .setTimeOut(10000)
                    // 对404 404的页面进行处理
                    .setAcceptStatCode(
                        new HashSet<Integer>() {
                          {
                            add(HttpConstant.StatusCode.CODE_200);
                            add(HttpStatus.HTTP_NOT_FOUND);
                            add(HttpStatus.HTTP_FORBIDDEN);
                          }
                        }))
            // 使用正则匹配子页面进行不同的爬取
            .setSubPageProcessors(
                new TopicProcess("https://www.zhihu.com/topics"),
                new SubTopicProcess(ZhiHuConstant.TOPIC_URL),
                new TopAnswerProcess(
                    "https://www.zhihu.com/api/v4/topics/\\d+/feeds/essence\\?limit=\\d+&offset=\\d+"),
                new AnswerPageProcess("https://www.zhihu.com/question/\\d+/answer/\\d+"));
    // 爬取知乎话题高赞回答
    Spider.create(compositePageProcessor)
        // 话题广场入口
        .addUrl("https://www.zhihu.com/topics")
        .thread(Runtime.getRuntime().availableProcessors() * 6)
        .run();

    // 保存话题json文件
    if (!ZhiHuConstant.topicState) {
      CopyOnWriteArrayList<Topic> rootTopic = TopicTree.getRootTopic();
      FileUtil.writeUtf8String(JSON.toJSONString(rootTopic, true), ZhiHuConstant.TOPIC_PATH);
    }
  }
}
