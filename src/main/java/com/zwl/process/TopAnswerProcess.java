package com.zwl.process;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter;
import com.google.common.collect.HashBasedTable;
import com.zwl.constant.ZhiHuConstant;
import com.zwl.model.Answer;
import com.zwl.model.Topic;
import com.zwl.util.TopicTree;
import lombok.extern.slf4j.Slf4j;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.handler.PatternProcessor;

import java.io.File;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

/**
 * 描述：爬取话题精华回答，点赞超过一万的回答
 *
 * @author zwl
 * @since 2022/5/23 16:53
 */
@Slf4j
public class TopAnswerProcess extends PatternProcessor {

    private static final HashBasedTable<Long, Integer, CopyOnWriteArrayList<Answer>> table = HashBasedTable.create();

    private static final ReentrantLock lock = new ReentrantLock();

    /**
     * @param pattern url pattern to handle
     */
    public TopAnswerProcess(String pattern) {
        super(pattern);
    }

    @Override
    public MatchOther processPage(Page page) {
        String url = page.getRequest().getUrl();
        Long topicId = Long.parseLong(StrUtil.subBetween(url, "topics/", "/"));
        long offset = Long.parseLong(StrUtil.subAfter(url, "offset=", true));
        JSONObject object = JSON.parseObject(page.getJson().toString());
        JSONObject paging;

        if (object == null || object.getJSONObject("paging") == null) {
            String redirectUrl = Optional.ofNullable(object).map(jsonObject -> jsonObject.getJSONObject("error")).map(obj -> obj.getString("redirect").replace("\\", "")).orElse("");
            log.warn("redirectUrl:{},\n{}", redirectUrl, page.getJson());
            writeAnswerFile(topicId);
            return MatchOther.NO;
        }

        paging = object.getJSONObject("paging");
        Boolean isEnd = paging.getBoolean("is_end");
        Boolean isStart = paging.getBoolean("is_start");

        if (isStart) {
            initAnswerFile(topicId);
        }

        // 解析话题答案
        Map<Integer, CopyOnWriteArrayList<Answer>> map = object.getJSONArray("data").stream().filter(o -> {
            JSONObject obj = (JSONObject) o;
            JSONObject target = obj.getJSONObject("target");
            String type = target.getString("type");
            Integer voteupCount = target.getInteger("voteup_count");
            // 类型为回答并且点赞超过一万
            return Objects.equals(type, "answer") && voteupCount > 10000;
        }).map(o -> {
            JSONObject obj = (JSONObject) o;
            JSONObject target = obj.getJSONObject("target");
            JSONObject question = target.getJSONObject("question");
            JSONObject author = target.getJSONObject("author");
            String authorName = author.getString("name");
            Integer voteupCount = target.getInteger("voteup_count");
            Integer commentCount = target.getInteger("comment_count");
            Integer answerId = target.getInteger("id");
            Integer questionId = question.getInteger("id");
            String title = question.getString("title");

            return new Answer().setAuthorName(authorName).setAnswerId(answerId).setQuestionId(questionId).setVoteupCount(voteupCount).setCommentCount(commentCount).setTitle(title).setAnswerUrl(StrUtil.format(ZhiHuConstant.ANSWER_PAGE_URL, questionId, answerId));
        }).collect(Collectors.groupingBy(Answer::getQuestionId, Collectors.toCollection(CopyOnWriteArrayList::new)));

        map.forEach((qid, answers) -> {
            lock.lock();
            try {
                CopyOnWriteArrayList<Answer> arrayList = table.get(topicId, qid);
                if (arrayList == null) {
                    table.put(topicId, qid, answers);
                } else {
                    arrayList.addAll(answers);
                }
            } catch (Exception ignore) {
            } finally {
                lock.unlock();
            }
        });

        if (isEnd) {
            writeAnswerFile(topicId);
            return MatchOther.NO;
        } else {
            // 翻页爬取
            page.addTargetRequest(new Request(ZhiHuConstant.ANSWER_URL.formatted(topicId, offset + 50)));
        }

        return MatchOther.YES;
    }

    private void initAnswerFile(Long topicId) {
        Topic topic = TopicTree.getTopicMap().get(topicId);
        // 初始化文件
        String fileName = ZhiHuConstant.TOPIC_ANSWER_FILE_NAME.formatted("answer", topic.getTopicName().replace("/", " "), topic.getTopicId(), "md");
        File file = new File(fileName);
        if (!file.exists()) {
            try {
                FileUtil.writeUtf8String("# " + topic.getTopicName() + "\n", file);
            } catch (Exception ignore) {
            }
        }
    }


    /**
     * 写入回答到文件
     *
     * @param topicId
     */
    private void writeAnswerFile(Long topicId) {
        Map<Integer, CopyOnWriteArrayList<Answer>> map = table.row(topicId);
        Topic topic = TopicTree.getTopicMap().get(topicId);
        // 文件
        String fileName = ZhiHuConstant.TOPIC_ANSWER_FILE_NAME.formatted("answer", topic.getTopicName().replace("/", " "), topic.getTopicId(), "md");
        String jsonFileName = ZhiHuConstant.TOPIC_ANSWER_FILE_NAME.formatted("json", topic.getTopicName().replace("/", " "), topic.getTopicId(), "json");

        map.forEach((qid, answers) -> {
            StringBuffer buffer = new StringBuffer();
            buffer.append("## ").append(answers.get(0).getTitle()).append("\n");
            answers.forEach(answer -> buffer.append("- [%s的回答](%s),点赞数：%d，评论数：%d\n".formatted(answer.getAuthorName(), answer.getAnswerUrl(), answer.getVoteupCount(), answer.getCommentCount())));
            FileUtil.appendUtf8String(buffer.toString(), fileName);
        });

        FileUtil.writeUtf8String(JSON.toJSONString(map, JSONWriter.Feature.PrettyFormat), jsonFileName);

    }

    @Override
    public MatchOther processResult(ResultItems resultItems, Task task) {
        return null;
    }
}
