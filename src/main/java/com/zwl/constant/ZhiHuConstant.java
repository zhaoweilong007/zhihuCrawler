package com.zwl.constant;

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

  public static final String ZHIHU_URL = "https://www.zhihu.com";
  public static final String HOT_TOP_URL =
      "https://www.zhihu.com/api/v3/feed/topstory/hot-lists/total";

  public static final String TOP_FORMAT = "- {}、[{}]({})";

  public static final String ARCHIVERS_FORMAT = "{}/archives/{}.md";

  public static final String JSON_FORMAT = "{}/json/{}.json";

  public static String PACKAGE_PATH;

  static {
    String resourcePath = new File(CrawlerApp.class.getResource("").getPath()).getPath();
    if (resourcePath.contains("build")) {
      PACKAGE_PATH = resourcePath.replace("/build/classes/java/main", "/src/main/java");
    } else {
      PACKAGE_PATH = resourcePath.replace("/out/production/classes", "/src/main/java");
    }
    log.info("package_path:{}", PACKAGE_PATH);
  }
}
