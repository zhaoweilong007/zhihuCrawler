package org.archive;

import lombok.extern.slf4j.Slf4j;
import org.archive.processor.TopActivityProcess;

/**
 * @author ZhaoWeiLong
 * @description 入口
 **/
@Slf4j
public class CrawlerMain {

  public static void main(String[] args) {
    final ZhiHuCrawler zhiHuCrawler = new ZhiHuCrawler();
    zhiHuCrawler.addSubPageProcessor(new TopActivityProcess());
    zhiHuCrawler.run();
  }
}
