package org.archive.processor;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.archive.constant.CrawlerConstants;
import org.archive.model.Answer;
import org.archive.utils.QueryUtils;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.handler.PatternProcessor;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * 爬取精华回答
 *
 * @author ZhaoWeiLong
 **/
@Slf4j
public class TopActivityProcess extends PatternProcessor {

    public TopActivityProcess(String pattern) {
        super(pattern);
    }

    public TopActivityProcess() {
        super(CrawlerConstants.TOP_ACTIVITY_URL_PATTERN);
    }


    @Override
    public MatchOther processPage(Page page) {
        final String url = page.getRequest().getUrl();
        final String topic = StrUtil.subBetween(url, "topics/", "/");
        final Map<String, String> queryMap = QueryUtils.getQueryMap(url);
        final int offset = Integer.parseInt(queryMap.get("offset"));
        final int limit = Integer.parseInt(queryMap.get("limit"));
        final String followers = queryMap.get("followers");
        log.info("process topic:【{}】 offset:【{}】 limit:【{}】", topic, offset, limit);
        JSONObject object = JSON.parseObject(page.getJson().toString());
        if (object == null) {
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
                    final Answer answer = new Answer();
                    answer.setAnswerId(answerId);
                    answer.setQuestionId(questionId);
                    answer.setQuestionTitle(question.getString("title"));
                    answer.setAuthorId(author.getString("id"));
                    answer.setAuthorName(author.getString("name"));
                    answer.setAvatarUrl(author.getString("avatar_url"));
                    answer.setHeadline(author.getString("headline"));
                    answer.setVoteupCount(target.getInteger("voteup_count"));
                    answer.setCommentCount(target.getInteger("comment_count"));
                    answer.setContent(question.getString("content"));
                    final JSONObject pictures = parsePictures(answer.getContent());
                    answer.setPictures(pictures.toJSONString());
                    answer.setPictureNum(pictures.size());
                    answer.setWordNum(countWordsWithoutHtmlTags(answer.getContent()));
                    answer.setCreatedTime(DateUtil.date(question.getLongValue("created_time")));
                    answer.setUpdatedTime(DateUtil.date(question.getLongValue("updated_time")));
                    answer.setAnswerUrl(StrUtil.format(CrawlerConstants.ANSWER_PAGE_URL, questionId, answerId));
                    return Entity.parseWithUnderlineCase(answer);
                }).collect(Collectors.toList());

        //保存数据库
        try {
            Db.use().insert(data);
        } catch (SQLException e) {
            log.error("回答写入数据库失败", e);
        }
        if (offset < 1000) {
            //next page
            final Request request = new Request(CrawlerConstants.TOP_ACTIVITY_URL.formatted(topic, offset + 50, followers));
            request.setPriority(Long.parseLong(followers));
            page.addTargetRequest(request);
        }
        return MatchOther.YES;
    }

    /**
     * 解析文本图片
     *
     * @return {@link JSONObject}
     */
    private JSONObject parsePictures(String content) {
        final JSONObject object = new JSONObject();
        Pattern pattern = Pattern.compile("<img\\s*[^>]*>");
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            final String pic = StrUtil.subBetween(matcher.group(), "src=\\\"", "?");
            final String fileName = StrUtil.subAfter(pic, "/", true);
            object.put(fileName, pic);
        }
        return object;
    }

    /**
     * 统计文本总数
     *
     * @return int
     */
    public int countWordsWithoutHtmlTags(String text) {
        // 使用正则表达式去除HTML标签
        String textWithoutHtml = text.replaceAll("<[^>]*>", "");
        return textWithoutHtml.length();
    }

    @Override
    public MatchOther processResult(ResultItems resultItems, Task task) {
        return null;
    }
}
