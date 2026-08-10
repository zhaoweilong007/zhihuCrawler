package org.archive.config;

import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.setting.yaml.YamlUtil;
import lombok.extern.slf4j.Slf4j;
import org.archive.properties.CrawlerProperties;

import java.io.BufferedReader;
import java.nio.charset.Charset;

/**
 * 配置
 *
 * @author ZhaoWeiLong
 **/
@Slf4j
public class CrawlerConfig {


    /**
     * 初始化配置
     *
     * @return 配置
     */
    public static CrawlerProperties loadProperties() {
        final BufferedReader reader = ResourceUtil.getReader("crawler.yml", Charset.defaultCharset());
        final CrawlerProperties properties = YamlUtil.load(reader, CrawlerProperties.class);
        log.info("load crawler.yal success");
        return properties;
    }

}
