package com.zwl.process;

import cn.hutool.core.util.StrUtil;
import com.alibaba.fastjson2.JSON;
import com.zwl.constant.ZhiHuConstant;
import com.zwl.model.Topic;
import com.zwl.util.TopicTree;
import lombok.extern.slf4j.Slf4j;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.handler.PatternProcessor;
import us.codecraft.webmagic.selector.Selectable;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.stream.Collectors;

/**
 * 描述：
 *
 * @author zwl
 * @since 2022/5/27 17:42
 **/
@Slf4j
public class TopicPageProcess extends PatternProcessor {

    public static final LinkedBlockingDeque<Request> topic_page_reqs=new LinkedBlockingDeque<>();

    private final String cookie;
    /**
     * @param pattern url pattern to handle
     */
    public TopicPageProcess(String pattern,String cookie) {
        super(pattern);
        this.cookie=cookie;
    }

    @Override
    public MatchOther processPage(Page page) {
        Long parentTopicId = Long.parseLong(StrUtil.subBetween(page.getUrl().toString(), "topic/", "/"));
        String followers = page.getHtml().xpath("//div[@class='zm-topic-side-followers-info']//strong/text()").toString();

        //更新topic话题关注度
        TopicTree.getTopicMap().get(parentTopicId).setFollowers(Long.parseLong(followers));

        List<Selectable> links = page.getHtml().xpath("//div[@id='zh-topic-organize-child-editor']//a[@class='zm-item-tag']").nodes();
        if (links.isEmpty()||links.size()==1){
            return MatchOther.NO;
        }

        CopyOnWriteArrayList<Topic> topics = links.stream().map(selectable -> {
            String tid = selectable.xpath("//a/@data-token").toString();
            String topicName = selectable.xpath("//a/text()").toString();
            return new Topic()
                    .setTopicId(Long.parseLong(tid))
                    .setTopicName(topicName)
                    .setParentId(parentTopicId);
        }).collect(Collectors.toCollection(CopyOnWriteArrayList::new));
        topics.stream().
                filter(topic -> !TopicTree.getTopicMap().containsKey(topic.getTopicId())).map(topic ->{
                    Request request = new Request(ZhiHuConstant.TOPIC_ORGANIZE_URL.formatted(topic.getTopicId()));
                    request.addCookie("z_c0",cookie);
                    return request;
                } ).forEach(page::addTargetRequest);


        log.info("topics:{}", JSON.toJSONString(topics));
        TopicTree.putNodeByParentId(topics,parentTopicId);
        return MatchOther.YES;
    }



    @Override
    public MatchOther processResult(ResultItems resultItems, Task task) {
        return null;
    }
}
