package org.archive.model;

import cn.hutool.core.annotation.PropIgnore;
import java.util.concurrent.CopyOnWriteArrayList;
import lombok.Data;

/**
 * 话题实体
 *
 * @author ZhaoWeiLong
 **/
@Data
public class Topic implements Model {

    /**
     * 主键
     */
    private Long id;

    /**
     * 话题id
     */
    private Long topicId;

    /**
     * 父话题id
     */
    private Long parentId;

    /**
     * 话题名称
     */
    private String topicName;

    /**
     * 关注人数
     */
    private Long followers;


    @PropIgnore
    private CopyOnWriteArrayList<Topic> subTopics;

}
