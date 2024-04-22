package org.archive.model;

import lombok.Data;

import java.util.Date;

/**
 * 回答实体
 *
 * @author ZhaoWeiLong
 **/
@Data
public class Answer {

    /**
     * 主键
     */
    private Long id;

    /**
     * 回答id
     */
    private Long answerId;
    /**
     * 问题id
     */
    private Long questionId;
    /**
     * 问题标题
     */
    private String questionTitle;


    /**
     * 作者id
     */
    private String authorId;

    /**
     * 作者
     */
    private String authorName;

    /**
     * 作者头像
     */
    private String avatarUrl;

    /**
     * 用户标题
     */
    private String headline;

    /**
     * 点赞数
     */
    private Integer voteupCount;
    /**
     * 评论数
     */
    private Integer commentCount;


    /**
     * 文本内容
     */
    private String content;


    /**
     * 图片数据，json格式，key为图片名称，value为图片base64
     */
    private String pictures;


    /**
     * 图片数量
     */
    private Integer pictureNum;

    /**
     * 字数
     */
    private Integer wordNum;

    /**
     * 回答创建时间
     */
    private Date createdTime;

    /**
     *
     */
    private Date updatedTime;

    /**
     * 回答url
     */
    private String answerUrl;
}
