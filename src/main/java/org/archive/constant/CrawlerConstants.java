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

    /**
     * 精华回答 api
     */
    String TOP_ACTIVITY_URL = "https://www.zhihu.com/api/v5.1/topics/%s/feeds/top_activity?offset=%s&limit=50&followers=%s";


    /**
     * 域名
     */
    String DO_MAIN = "zhihu.com";

    /**
     * 初始化topic
     */
    String INIT_TOPIC_KEY = "init_topic_key";

    /**
     * 成功总数
     */
    String CRAWLER_SUCCESS_COUNT = "crawler_success_count";

    /**
     * 失败总数
     */
    String CRAWLER_ERROR_COUNT = "crawler_error_count";

    /**
     * 失败队列
     */
    String CRAWLER_ERROR_QUEUE = "crawler_error_queue";

    /**
     * db insert error
     */
    String CRAWLER_DB_SAVE_ERROR_QUEUE = "crawler_db_save_error_queue";

}
