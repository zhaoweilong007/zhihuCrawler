package com.zwl.constant;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;
import com.zwl.CrawlerApp;
import lombok.extern.slf4j.Slf4j;

import java.io.File;

/**
 * 描述：知乎常量
 *
 * @author zwl
 * @since 2022/5/20 16:09
 */
@Slf4j
public class ZhiHuConstant {

  public static final String PACKAGE_PATH;

  public static Boolean topicState;

  public static final String TOPIC_PATH;

  static {
    String resourcePath = new File(CrawlerApp.class.getResource("").getPath()).getPath();
    if (resourcePath.contains("build")) {
      PACKAGE_PATH = StrUtil.subBefore(resourcePath, "build", true) + "data";
    } else {
      PACKAGE_PATH = StrUtil.subBefore(resourcePath, "out", true) + "data";
    }
    TOPIC_PATH = PACKAGE_PATH + File.separator + "topic" + File.separator + "topic.json";
    topicState = FileUtil.exist(TOPIC_PATH);
  }

  public static final String ZHIHU_URL = "https://www.zhihu.com";
  public static final String HOT_TOP_URL =
      "https://www.zhihu.com/api/v3/feed/topstory/hot-lists/total";

  public static final String QUESTION_URL = "https://www.zhihu.com/question/{}";

  public static final String TOPIC_URL = "https://www.zhihu.com/node/TopicsPlazzaListV2";

  public static final String ANSWER_URL =
      "https://www.zhihu.com/api/v4/topics/%d/feeds/essence?limit=50&offset=%d";

  public static final String ANSWER_PAGE_URL = "https://www.zhihu.com/question/{}/answer/{}";

  public static final String TOP_FORMAT = "- {}、[{}]({})";

  public static final String ARCHIVERS_FORMAT = "{}/archives/{}.md";

  public static final String JSON_FORMAT = "{}/json/{}.json";

  public static final String TOPIC_PARAM = "{\"topic_id\":{},\"offset\":{},\"hash_id\":\"\"}";
}
