package org.archive.model;

import lombok.Data;

/**
 * @author ZhaoWeiLong
 * @description 话题实体
 **/
@Data
public class Topic {

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

}
