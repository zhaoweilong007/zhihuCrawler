package org.archive.properties;

import lombok.Data;

/**
 * 配置属性
 *
 * @author ZhaoWeiLong
 **/
@Data
public class CrawlerProperties {


    /**
     * redis config
     */
    private RedisProperties redis;

    /**
     * proxy config
     */
    private ProxyProperties proxy;

    /**
     * object storage
     */
    private OssProperties oss;

    /**
     * db save thread config
     */
    private ThreadPoolProperties thread;


}
