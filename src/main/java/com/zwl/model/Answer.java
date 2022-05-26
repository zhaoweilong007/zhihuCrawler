package com.zwl.model;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 描述：回答
 *
 * @author zwl
 * @since 2022/5/25 14:14
 */
@Data
@Accessors(chain = true)
public class Answer {

  Integer voteupCount;
  Integer commentCount;
  Integer answerId;
  Integer questionId;
  String title;
  String authorName;
}
