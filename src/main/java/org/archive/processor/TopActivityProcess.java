package org.archive.processor;

import cn.hutool.core.util.StrUtil;
import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.archive.ZhiHuCrawler;
import org.archive.constant.CrawlerConstants;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.handler.PatternProcessor;

/**
 * @author ZhaoWeiLong
 * @description 爬取精华回答
 **/
@Slf4j
public class TopActivityProcess extends PatternProcessor {


  public TopActivityProcess(String pattern) {
    super(pattern);
  }

  public TopActivityProcess() {
    super(CrawlerConstants.TOP_ACTIVITY_URL);

  }


  @Override
  public MatchOther processPage(Page page) {
    JSONObject object = JSON.parseObject(page.getJson().toString());
    if (object == null || object.getJSONObject("paging") == null) {
      return MatchOther.NO;
    }

    final List<Entity> data = object.getJSONArray("data").stream()
        .map(o -> {
          final JSONObject obj = (JSONObject) o;
          JSONObject target = obj.getJSONObject("target");
          JSONObject question = target.getJSONObject("question");
          JSONObject author = target.getJSONObject("author");
          Long answerId = target.getLong("id");
          Long questionId = question.getLong("id");
          return Entity.create("answer")
              .set("anchor_name", author.getString("name"))
              .set("voteup_count", target.getInteger("voteup_count"))
              .set("comment_count", target.getInteger("comment_count"))
              .set("answer_id", answerId)
              .set("question_id", questionId)
              .set("title", question.getString("title"))
              .set("content", question.getString("content"))
              .set("updated_time", question.getString("updated_time"))
              .set("answerUrl", StrUtil.format(CrawlerConstants.ANSWER_PAGE_URL, questionId, answerId))
              ;
        }).collect(Collectors.toList());

    //保存数据库
    try {
      Db.use().insert(data);
    } catch (SQLException e) {
      log.error("回答写入数据库失败", e);
    }
    //增加评论爬取
//        data.forEach(entity -> CrawlerUtils.addReqyest(ZhiHuConstant.COMMENT_URL.formatted(entity.get("answer_id"))));
    return MatchOther.YES;
  }

  @Override
  public MatchOther processResult(ResultItems resultItems, Task task) {
    return null;
  }
}
