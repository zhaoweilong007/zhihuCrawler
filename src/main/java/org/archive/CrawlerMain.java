package org.archive;

import lombok.extern.slf4j.Slf4j;
import org.archive.config.CrawlerConfig;
import org.archive.processor.TopActivityProcess;
import org.archive.properties.CrawlerProperties;

/**
 * @author ZhaoWeiLong
 * @description 入口
 **/
@Slf4j
public class CrawlerMain {

  public static void main(String[] args) throws Exception {
    final CrawlerProperties properties = CrawlerConfig.init();
    final ZhiHuCrawler zhiHuCrawler = new ZhiHuCrawler(properties);
    zhiHuCrawler.addSubPageProcessor(new TopActivityProcess());
    zhiHuCrawler.run();
  }
}
