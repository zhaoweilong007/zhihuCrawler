package org.archive;

import java.util.List;
import org.archive.config.CrawlerConfig;
import org.archive.listener.RedisMonitorSpiderListener;
import org.archive.processor.AnswerPageProcess;
import org.archive.processor.TopActivityProcess;

/**
 * 入口
 *
 * @author ZhaoWeiLong
 **/
public class Main {

  public static void main(String[] args) {
    ZhiHuSpider.create(CrawlerConfig.loadProperties())
        .addSubPageProcessor(new TopActivityProcess())
        .addSubPageProcessor(new AnswerPageProcess())
        .setSpiderListeners(List.of(new RedisMonitorSpiderListener()))
        .run();
  }
}
