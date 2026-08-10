package org.crawler.test;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.lang.tree.Tree;
import cn.hutool.core.lang.tree.TreeUtil;
import cn.hutool.core.util.PageUtil;
import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import cn.hutool.db.handler.BeanListHandler;
import cn.hutool.system.SystemUtil;
import com.google.common.util.concurrent.RateLimiter;
import org.archive.model.Answer;
import org.archive.model.Topic;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author ZhaoWeiLong
 * @since 2024/5/13
 **/

public class GenerateMarkDownTest {

    private static final Logger log = LoggerFactory.getLogger(GenerateMarkDownTest.class);
    final ExecutorService executorService = Executors.newFixedThreadPool(16);
    final String dir = SystemUtil.getUserInfo().getCurrentDir();
    final String articlePath = dir + "document" + FileUtil.FILE_SEPARATOR + "article";
    final String rootPath = dir + "document" + FileUtil.FILE_SEPARATOR + "根话题";
    final String unclassifiedPath = dir + "document" + FileUtil.FILE_SEPARATOR + "「未归类」话题";

    @Test
    public void gen() throws SQLException {
        final Db database = Db.use();
        ConcurrentHashMap<Long, String> topicPathMap = new ConcurrentHashMap<>();
        final Entity topicEntity = Entity.parseWithUnderlineCase(new Topic());
        final List<Topic> topicList = database.findAll(topicEntity, Topic.class);
        final List<Tree<Long>> trees = TreeUtil.build(topicList, 0L, (node, tree) -> {
            tree.setId(node.getTopicId());
            tree.setParentId(node.getParentId());
            tree.setName(node.getTopicName());
            tree.setWeight(node.getFollowers());
        });
        trees.forEach(node -> {
            String path = dir + "document" + FileUtil.FILE_SEPARATOR + node.getName().toString().trim();
            topicPathMap.put(node.getId(), path);
            createTopicDir(node, node.getChildren(), topicPathMap);
        });


        final Entity entity = Entity.parseWithUnderlineCase(new Answer());
        final long total = database.count(entity);
        if (total == 0) {
            return;
        }
        Long nextId = null;
        ConcurrentHashMap<Long, String> questionPathMap = new ConcurrentHashMap<>();
        for (int i = 0; i < PageUtil.totalPage(total, 500); i++) {
            List<Answer> data;
            if (i == 0) {
                data = database.query("""
                        select * from answer order by id limit 500
                        """, BeanListHandler.create(Answer.class));
            } else {
                data = database.query("""
                        select * from answer where id>?  order by id limit 500
                        """, BeanListHandler.create(Answer.class), nextId);
            }
            nextId = data.get(data.size() - 1).getId();
            if (CollUtil.isEmpty(data)) {
                return;
            }

            createQuestionDir(data, topicPathMap, questionPathMap);

            writeMarkDown(data, questionPathMap, topicPathMap);
        }

    }

    private void createQuestionDir(List<Answer> data, ConcurrentHashMap<Long, String> topicPathMap, ConcurrentHashMap<Long, String> questionPathMap) {
        final ConcurrentMap<Long, Answer> questionMap = data.stream().filter(answer -> answer.getQuestionId() != null).collect(Collectors.toConcurrentMap(Answer::getQuestionId, Function.identity(), (s, s2) -> s));
        for (Map.Entry<Long, Answer> entry : questionMap.entrySet()) {
            if (questionPathMap.containsKey(entry.getKey())) {
                return;
            }
            final String questionTitle = entry.getValue().getQuestionTitle().trim();
            final String topicPath = topicPathMap.get(entry.getValue().getTopicId());
            String path = topicPath + FileUtil.FILE_SEPARATOR + questionTitle;
            questionPathMap.put(entry.getKey(), path);
        }

    }

    private void createTopicDir(Tree<Long> parent, List<Tree<Long>> topics, ConcurrentHashMap<Long, String> topicPathMap) {
        if (CollUtil.isEmpty(topics)) {
            return;
        }
        topics.forEach(topic -> {
            final String parentPath = topicPathMap.get(parent.getId());
            final String filePath = parentPath + FileUtil.FILE_SEPARATOR + topic.getName().toString().trim();
            topicPathMap.put(topic.getId(), filePath);
            createTopicDir(topic, topic.getChildren(), topicPathMap);
        });
    }

    private void writeMarkDown(List<Answer> answers, ConcurrentHashMap<Long, String> questionPathMap, ConcurrentHashMap<Long, String> topicPathMap) {
        answers.forEach(answer -> {
            String filePath = null;
            try {
                final Document document = Jsoup.parse(answer.getContent());
                final StringBuffer buffer = new StringBuffer();
                if (answer.getQuestionId() == null) {
                    filePath = articlePath + FileUtil.FILE_SEPARATOR + "【" + answer.getAuthorName().trim() + "】的文章_" + answer.getAnswerId();
                } else {
                    String path = questionPathMap.get(answer.getQuestionId());
                    // 不存在topic的情况
                    if (path == null) {
                        path = topicPathMap.get(answer.getTopicId());
                        if (path != null) {
                            path = path + FileUtil.FILE_SEPARATOR + answer.getQuestionTitle().trim();
                        } else {
                            parseTopic(answer, questionPathMap);
                        }
                    }
                    filePath = path + FileUtil.FILE_SEPARATOR + "【" + answer.getAuthorName().trim() + "】的回答_" + answer.getAnswerId();
                    buffer.append("# ").append(answer.getQuestionTitle());
                    buffer.append("\n");
                }
                filePath = filePath + ".md";
                filePath = filePath.replace("?", "");
                buffer.append("- 点赞数：").append(answer.getVoteupCount());
                buffer.append("\n");
                buffer.append("- 更新时间：").append(DateUtil.date(answer.getUpdatedTime()).toString(DatePattern.CHINESE_DATE_TIME_PATTERN));
                buffer.append("\n");
                buffer.append("- 回答url：").append(answer.getAnswerUrl());
                buffer.append("\n");
                buffer.append(document.body());
                final File file = new File(filePath);
                FileUtil.touch(file);
                FileUtil.writeUtf8String(buffer.toString(), file);
            } catch (Exception e) {
                log.error("写入失败,filePath:{}", filePath, e);
            }
        });

    }


    String url = "https://www.zhihu.com/topic/%s";


    RateLimiter rateLimiter = RateLimiter.create(0.3);


    private void parseTopic(Answer answer, ConcurrentHashMap<Long, String> questionPathMap) {
        try {
            rateLimiter.acquire();
            final Document document = Jsoup.connect(url.formatted(answer.getTopicId())).get();
            final Element element = document.selectFirst("div.TopicMetaCard-title");

            if (element == null) {
                return;
            }
            final String topicName = element.text();

            final Topic topic = new Topic();
            topic.setTopicId(answer.getTopicId());
            topic.setTopicName(topicName.trim());
            topic.setParentId(0L);
            topic.setParse(false);

            String filepath = rootPath + FileUtil.FILE_SEPARATOR + topicName.trim() + FileUtil.FILE_SEPARATOR + answer.getQuestionTitle().trim();
            questionPathMap.put(answer.getQuestionId(), filepath);
            Db.use().insert(Entity.parseWithUnderlineCase(topic));
        } catch (Exception e) {
            log.error("写入topic失败", e);
        }

    }

}
