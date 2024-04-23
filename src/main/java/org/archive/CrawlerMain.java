package org.archive;

import lombok.extern.slf4j.Slf4j;
import org.archive.config.CrawlerConfig;
import org.archive.processor.TopActivityProcess;
import org.archive.properties.CrawlerProperties;

/**
 * 入口
 *
 * @author ZhaoWeiLong
 **/
@Slf4j
public class CrawlerMain {

    public static void main(String[] args) throws Exception {
        final ZhiHuCrawler zhiHuCrawler = new ZhiHuCrawler(CrawlerConfig.loadProperties());
        zhiHuCrawler.addSubPageProcessor(new TopActivityProcess());
        zhiHuCrawler.run();
    }
}
