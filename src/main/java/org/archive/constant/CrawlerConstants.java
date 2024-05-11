package org.archive.constant;

import cn.hutool.core.collection.CollUtil;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

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

    String ANSWER_PAGE_URL_PATTERN = "https://www.zhihu.com/question/\\d+/answer/\\d+";

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


    String[] defaultUAArray = new String[]{
            "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/49.0.2623.110 Safari/537.36",
            "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/48.0.2623.110 Safari/537.36",
            "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/47.0.2623.110 Safari/537.36",
            "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/46.0.2623.110 Safari/537.36",
            "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2623.110 Safari/537.36",
            "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2623.110 Safari/537.36",
            "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2623.110 Safari/537.36",
            "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2623.110 Safari/537.36",
            "Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:50.0) Gecko/20100101 Firefox/50.0",
            "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.115 Safari/537.36"
    };

    List<String> uas = new CopyOnWriteArrayList<>();


    String ANSWER_CONTENT_KEY = "answer_content_key";


    static String getUserAgent() {
        if (CollUtil.isNotEmpty(uas)) {
            int index = (int) (Math.random() * uas.size());
            return uas.get(index);
        } else {
            return defaultUAArray[new Random().nextInt(defaultUAArray.length)];
        }
    }

}
