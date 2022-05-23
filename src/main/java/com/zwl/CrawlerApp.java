package com.zwl;

import com.zwl.constant.ZhiHuConstant;
import com.zwl.process.ZhiHuHotTopProcess;
import lombok.extern.slf4j.Slf4j;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.ConsolePipeline;
import static com.zwl.constant.ZhiHuConstant.*;
import java.io.File;

/**
 * 描述：爬虫入口
 *
 * @author zwl
 * @since 2022/5/20 15:16
 */
@Slf4j
public class CrawlerApp {

  public static void main(String[] args) {


    Spider.create(new ZhiHuHotTopProcess())
            .addUrl(ZhiHuConstant.HOT_TOP_URL)
            .addPipeline(new ConsolePipeline()).run();
  }
}
