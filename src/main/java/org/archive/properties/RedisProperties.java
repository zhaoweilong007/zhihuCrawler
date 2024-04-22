package org.archive.properties;

import lombok.Data;

/**
 * redis config
 *
 * @author ZhaoWeiLong
 **/
@Data
public class RedisProperties {


    private String host = "localhost";

    private Integer port = 6379;

    private String username;

    private String password;

    private Integer timeout = 2000;

    private Integer database = 0;

    private Integer maxTotal = 10;

    private Integer maxIdle = 5000;

    private Integer minIdle = 1000;

}
