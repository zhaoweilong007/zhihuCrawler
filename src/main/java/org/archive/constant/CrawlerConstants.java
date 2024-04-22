package org.archive.constant;

/**
 * 常量
 *
 * @author ZhaoWeiLong
 **/
public interface CrawlerConstants {

    /**
     * 回答地址
     */
    String ANSWER_PAGE_URL = "https://www.zhihu.com/question/{}/answer/{}";

    /**
     * 精华回答
     */
    String TOP_ACTIVITY_URL_PATTERN = "https://www.zhihu.com/api/v5.1/topics/\\d+/feeds/top_activity?.*";


    String TOP_ACTIVITY_URL = "https://www.zhihu.com/api/v5.1/topics/%s/feeds/top_activity?offset=%s&limit=50&followers=%s";


    /**
     * 域名
     */
    String DO_MAIN = "zhihu.com";

    /**
     * 初始化topic
     */
    String INIT_TOPIC_KEY = "init_topic_key";

}
