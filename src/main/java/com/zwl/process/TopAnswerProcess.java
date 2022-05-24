package com.zwl.process;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.handler.PatternProcessor;

/**
 * 描述：爬取话题精华回答，点赞超过一万的回答
 *
 * @author zwl
 * @since 2022/5/23 16:53
 */
public class TopAnswerProcess extends PatternProcessor {

  /**
   * @param pattern url pattern to handle
   */
  public TopAnswerProcess(String pattern) {
    super(pattern);
  }

  @Override
  public MatchOther processPage(Page page) {
    return null;
  }

  @Override
  public MatchOther processResult(ResultItems resultItems, Task task) {
    return null;
  }
}
