package org.archive.properties;

import lombok.Data;

/**
 * @author ZhaoWeiLong
 * @description
 **/
@Data
public class RedisProperties {


  private String host = "localhost";

  private Integer port = 6379;

  private String password;

}
