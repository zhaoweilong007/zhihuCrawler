package org.archive.model;


import lombok.Data;

import java.net.Proxy;
import java.time.LocalDateTime;

/**
 * @author ZhaoWeiLong
 **/
@Data
public class ProxyEntity {

    private Integer id;

    private String host;

    private Integer port;

    private Boolean available;

    private String type = "http";

    private String country;

    private String location;

    /**
     * 匿名类型
     */
    private String anonymityType;

    private Long responseTime;

    private LocalDateTime validateTime;

    private String source;

    private Proxy.Type proxyType;

    private String username;

    private String password;

}
