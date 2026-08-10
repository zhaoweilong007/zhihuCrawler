package org.archive.properties;

import lombok.Data;

/**
 * thread config
 *
 * @author ZhaoWeiLong
 **/
@Data
public class ThreadPoolProperties {

    /**
     * 请求间隔等待时间 （防止请求太频繁封ip）
     */
    private Integer sleepTime = 500;
    /* 单次合并最大请求大小 */
    private Integer maxRequestSize = 1000;
    /* 线程工厂核心线程数 */
    private Integer corePoolSize = 1;
    /* 合并请求间隔（单位毫秒） */
    private Integer requestInterval = 5000;
}
