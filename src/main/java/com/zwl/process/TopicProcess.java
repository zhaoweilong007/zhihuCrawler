package com.zwl.process;

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
    CopyOnWriteArrayList<Topic> topics =
        page.getHtml().xpath("//ul[@class='zm-topic-cat-main clearfix']/li").nodes().stream()
            .map(
                node -> {
                  String topicName = node.xpath("//a/text()").toString();
                  Long topicId = Long.valueOf(node.xpath("//li/@data-id").toString());

                  page.addTargetRequest(CrawlerUtils.assemblyBody(topicId, 0));
                  return new Topic().setTopicId(topicId).setTopicName(topicName).setParentId(0L);
                })
            .collect(Collectors.toCollection(CopyOnWriteArrayList::new));

    // 设置根话题列表
    TopicTree.setRootTopic(topics);

    return MatchOther.YES;
  }

  @Override
  public MatchOther processResult(ResultItems resultItems, Task task) {
    return null;
  }
}
