package org.archive.processor;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.db.Entity;
import cn.hutool.http.HttpStatus;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.archive.constant.CrawlerConstants;
import org.archive.model.Answer;
import org.archive.utils.EntityUtils;
import org.archive.utils.QueryUtils;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.handler.PatternProcessor;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
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
        if (page.getStatusCode() == HttpStatus.HTTP_FORBIDDEN) {
            throw new RuntimeException("ip has been blocked by zhihu");
        }
        try {
            return process(page);
        } catch (Exception e) {
            log.error("process page error url:【{}】", page.getUrl(), e);
            return MatchOther.NO;
        }
    }

    private MatchOther process(Page page) {
        final Request pageRequest = page.getRequest();
        final String url = page.getRequest().getUrl();
        final Long topicId = Long.parseLong(StrUtil.subBetween(url, "topics/", "/"));
        final Map<String, String> queryMap = QueryUtils.getQueryMap(url);
        final int offset = Integer.parseInt(queryMap.get("offset"));
        final int limit = Integer.parseInt(queryMap.get("limit"));
        log.info("process topic:【{}】 offset:【{}】 ", topicId, offset);
        JSONObject object = JSON.parseObject(page.getJson().toString());
        if (object == null) {
            log.warn("process topic json is null:【{}】 offset:【{}】", topicId, offset);
            return MatchOther.NO;
        }
        final JSONArray array = object.getJSONArray("data");
        if (array == null || array.isEmpty()) {
            log.warn("process topic data is null:【{}】 offset:【{}】 ", topicId, offset);
            return MatchOther.NO;
        }
        AtomicBoolean flag = new AtomicBoolean(true);
        final List<Entity> data = array.stream()
                .filter(o -> {
                    final JSONObject obj = (JSONObject) o;
                    JSONObject target = obj.getJSONObject("target");
                    final Integer voteupCount = target.getInteger("voteup_count");
                    final boolean check = voteupCount > 5000;
                    if (!check) {
                        flag.set(false);
                    }
                    return check;
                })
                .map(o -> {
                    final JSONObject obj = (JSONObject) o;
                    JSONObject target = obj.getJSONObject("target");
                    final String type = target.getString("type");
                    if (!StrUtil.containsAny(type, "answer", "article")) {
                        return null;
                    }
                    JSONObject question = target.getJSONObject("question");
                    JSONObject author = target.getJSONObject("author");
                    final Answer answer = new Answer();
                    answer.setTopicId(topicId);
                    answer.setAuthorId(author.getString("id"));
                    answer.setAuthorName(author.getString("name"));
                    answer.setAvatarUrl(author.getString("avatar_url"));
                    answer.setHeadline(author.getString("headline"));
                    answer.setAnswerId(target.getLong("id"));
                    answer.setVoteupCount(target.getInteger("voteup_count"));
                    answer.setCommentCount(target.getInteger("comment_count"));
                    answer.setContent(target.getString("content"));
                    final JSONObject pictures = parsePictures(answer.getContent());
                    answer.setPictureNum(pictures.size());
                    answer.setPictures(pictures.toJSONString());
                    answer.setWordNum(countWordsWithoutHtmlTags(answer.getContent()));
                    answer.setType(target.getString("type"));
                    answer.setQuestionTitle(question.getString("title"));
                    if (Objects.equals(answer.getType(), "answer")) {
                        answer.setCreatedTime(DateUtil.date(target.getLongValue("created_time") * 1000));
                        answer.setUpdatedTime(DateUtil.date(target.getLongValue("updated_time") * 1000));
                        answer.setQuestionId(question.getLong("id"));
                        answer.setAnswerUrl(
                                StrUtil.format(CrawlerConstants.ANSWER_PAGE_URL, answer.getQuestionId(),
                                        answer.getAnswerId()));
                    } else if (Objects.equals(answer.getType(), "article")) {
                        answer.setCreatedTime(DateUtil.date(target.getLongValue("created") * 1000));
                        answer.setUpdatedTime(DateUtil.date(target.getLongValue("updated") * 1000));
                        answer.setAnswerUrl(target.getString("url"));
                    }
                    return Entity.parseWithUnderlineCase(answer);
                }).filter(Objects::nonNull)
                .collect(Collectors.toList());

        // save db
        EntityUtils.saveEntity(data);

        if (flag.get() && offset < 1000) {
            // next page
            final Request request = new Request(
                    CrawlerConstants.TOP_ACTIVITY_URL.formatted(topicId, offset + 50));
            request.setPriority(pageRequest.getPriority());
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
        if (StrUtil.isBlank(content)) {
            return object;
        }
        Pattern pattern = Pattern.compile("<img\\s*[^>]*>");
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            final String group = matcher.group();
            final String pic = StrUtil.subBetween(group, "src=\"", "?");
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
