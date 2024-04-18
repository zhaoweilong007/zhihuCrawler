package org.archive.properties;

import lombok.Data;

/**
 * @author ZhaoWeiLong
 * @description 配置属性
 **/
@Data
public class CrawlerProperties {


    /**
     * redis config
     */
    private RedisProperties redis;


    /**
     * datasource config
     */
    private DBProperties db;


    /**
     * threadPool config
     */
    private ThreadPoolProperties thread;


    /**
     * proxy config
     */
    private ProxyProperties proxy;

    /**
     * object storage
     */
    private OssProperties oss;


}
