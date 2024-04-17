package org.archive;

import cn.hutool.core.util.CharsetUtil;
import cn.hutool.http.HttpStatus;
import java.util.HashSet;
import lombok.extern.slf4j.Slf4j;
import org.archive.constant.CrawlerConstants;
import org.archive.properties.CrawlerProperties;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.handler.CompositePageProcessor;
import us.codecraft.webmagic.handler.SubPageProcessor;
import us.codecraft.webmagic.scheduler.Scheduler;

/**
 * @author ZhaoWeiLong
 * @description
 **/
@Slf4j
public class ZhiHuCrawler {

  private CrawlerProperties properties;

  private Site site;

  private CompositePageProcessor processors;

  private Scheduler scheduler;


  public ZhiHuCrawler() {
    this.site = Site.me()
        .setDomain(CrawlerConstants.DO_MAIN)
        .setCharset(CharsetUtil.UTF_8)
        .setAcceptStatCode(new HashSet<>() {
          {
            add(HttpStatus.HTTP_OK);
            add(HttpStatus.HTTP_NOT_FOUND);
            add(HttpStatus.HTTP_FORBIDDEN);
          }
        });
    this.processors = new CompositePageProcessor(site);
  }

  public void addSubPageProcessor(SubPageProcessor subPageProcessor) {
    this.processors.addSubPageProcessor(subPageProcessor);
  }


  public void run() {
    Spider.create(processors)
        .setScheduler(scheduler)
        .run();
  }


}
