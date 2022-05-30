package com.zwl.process;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.io.FileUtil;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.TypeReference;
import com.zwl.constant.ZhiHuConstant;
import com.zwl.model.Topic;
import com.zwl.util.CrawlerUtils;
import com.zwl.util.TopicTree;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.handler.PatternProcessor;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

/**
 * 描述：根话题列表
 *
 * @author zwl
 * @since 2022/5/23 16:41
 */
public class TopicProcess extends PatternProcessor {

  /**
   * @param pattern url pattern to handle
   */
  public TopicProcess(String pattern) {
    super(pattern);
  }

  @Override
  public MatchOther processPage(Page page) {
    //if (TopicTree.checkTopic()) {
    //  // 初始化已存在的topic
    //  TopicTree.getRootTopic().forEach(topic -> forEachAddRequest(topic.getSubTopics()));
    //} else {
    //  CopyOnWriteArrayList<Topic> topics =
    //      page.getHtml().xpath("//ul[@class='zm-topic-cat-main clearfix']/li").nodes().stream()
    //          .map(
    //              node -> {
    //                String topicName = node.xpath("//a/text()").toString();
    //                Long topicId = Long.valueOf(node.xpath("//li/@data-id").toString());
    //
    //                // 添加子话题爬取
    //                page.addTargetRequest(CrawlerUtils.assemblyBody(topicId, 0));
    //                return new Topic().setTopicId(topicId).setTopicName(topicName).setParentId(0L);
    //              })
    //          .collect(Collectors.toCollection(CopyOnWriteArrayList::new));
    //
    //  // 设置根话题列表
    //  TopicTree.setRootTopic(topics);
    //}
    //
    //// 添加topic回答爬取，最多同时5条请求
    ////for (int i = 0; i < 3; i++) {
    ////  page.addTargetRequest(CrawlerUtils.pollReq());
    ////}

    return MatchOther.YES;
  }



  /**
   * 递归添加请求
   *
   //* @param topics
   */
  //private void forEachAddRequest(CopyOnWriteArrayList<Topic> topics) {
  //  if (CollectionUtil.isEmpty(topics)) {
  //    return;
  //  }
  //  topics.forEach(
  //      topic -> {
  //          CrawlerUtils.putReq(ZhiHuConstant.ANSWER_URL.formatted(topic.getTopicId(), 0));
  //        if (CollectionUtil.isNotEmpty(topic.getSubTopics())) {
  //          forEachAddRequest(topic.getSubTopics());
  //        }
  //      });
  //}

  @Override
  public MatchOther processResult(ResultItems resultItems, Task task) {
    return null;
  }
}
