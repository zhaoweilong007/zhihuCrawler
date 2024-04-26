package org.archive;

import org.archive.config.CrawlerConfig;
import org.archive.processor.TopActivityProcess;

/**
 * 入口
 *
 * @author ZhaoWeiLong
 **/
public class Main {

    public static void main(String[] args) throws Exception {
        final ZhiHuCrawler zhiHuCrawler = new ZhiHuCrawler(CrawlerConfig.loadProperties());
        zhiHuCrawler.addSubPageProcessor(new TopActivityProcess());
        zhiHuCrawler.run();
    }
}
