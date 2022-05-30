package com.zwl;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.http.HttpStatus;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONWriter;
import com.zwl.constant.ZhiHuConstant;
import com.zwl.listener.CrawlerListener;
import com.zwl.model.Topic;
import com.zwl.process.*;
import com.zwl.util.TopicTree;
import lombok.extern.slf4j.Slf4j;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.handler.CompositePageProcessor;
import us.codecraft.webmagic.pipeline.ConsolePipeline;
import us.codecraft.webmagic.utils.HttpConstant;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;

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
        .addPipeline(new ConsolePipeline())
        .run();


      String cookie="2|1:0|10:1653550336|4:z_c0|92:Mi4xVG5jeEJRQUFBQUFBRUZBR1JvRzZGQ1lBQUFCZ0FsVk5BSHQ4WXdCSk5oTTNpaU11eVQ0aWc0WEt0YVBIQl9xR2x3|de809eeaf0760c02b551ea3b9b035e9fe0e4cadcda1e9acbee488e8b6be29497";

      Spider spider = Spider.create(assemblyPage(cookie))
              //.addUrl(TOPICS_PAGE_URL)
              .thread(10);
      spider.setSpiderListeners(new ArrayList<>() {{
          add(new CrawlerListener(spider));
      }});

      log.info("《《《《《《《《《《《《《《《《开始爬取topic》》》》》》》》》》》》》》");
      if (!TopicTree.checkTopic()) {
          TopicTree.setRootTopic(new CopyOnWriteArrayList<>(){{
              add(new Topic()
                      .setTopicId(19776749L)
                      .setTopicName("根话题")
                      .setParentId(0L));
          }});

          Request request = new Request("https://www.zhihu.com/topic/19776749/organize");
          request.addCookie("z_c0",cookie);
          spider.addRequest(request).run();

          log.info("《《《《《《《《《《《《《《topic爬取完成，开始写入topic文件》》》》》》》》》》》》》》");
          // 保存话题json文件
          FileUtil.writeUtf8String(JSON.toJSONString(TopicTree.getRootTopic(), JSONWriter.Feature.PrettyFormat), ZhiHuConstant.TOPIC_PATH);
      }

      //开始爬取高赞回答
      CopyOnWriteArrayList<Topic> heightTopics = new CopyOnWriteArrayList<>();
      TopicTree.getRootTopic().forEach(topic -> {
          spider.addUrl(ZhiHuConstant.ANSWER_URL.formatted(topic.getTopicId(), 0));
          heightTopics.add(topic);
          forEachAddRequest(spider,topic.getSubTopics(),heightTopics);
      });

      FileUtil.writeUtf8String(JSON.toJSONString(heightTopics, JSONWriter.Feature.PrettyFormat), PACKAGE_PATH+ File.separator + "topic" + File.separator + "heightTopics.json");
      spider.thread(2).run();
  }

    private static void forEachAddRequest(Spider spider, CopyOnWriteArrayList<Topic> topics, CopyOnWriteArrayList<Topic> heightTopics) {
      if (CollectionUtil.isEmpty(topics)) {
        return;
      }
      topics.stream()
              .filter(topic -> topic.getFollowers()>10000)
              .forEach(topic -> {
              spider.addUrl(ZhiHuConstant.ANSWER_URL.formatted(topic.getTopicId(), 0));
              heightTopics.add(topic);
            if (CollectionUtil.isNotEmpty(topic.getSubTopics())) {
              forEachAddRequest(spider, topic.getSubTopics(), topics);
            }
          });
    }

  private static CompositePageProcessor assemblyPage(){
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

    private static CompositePageProcessor assemblyPage(String cookie){
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
                                new TopicPageProcess(TOPIC_PAGE_PATTERN,cookie),
                                new SubTopicProcess(TOPIC_URL),
                                new TopAnswerProcess(ANSWER_PATTERN),
                                new AnswerPageProcess(ANSWER_PAGE_PATTERN));
    }


}
