package org.archive.utils;

import cn.hutool.core.util.StrUtil;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 解析request的query参数工具
 *
 * @author ZhaoWeiLong
 */
public class QueryUtils {
    /**
     * 通过query字符串得到参数的map
     *
     * @param queryString ?后的字符
     */
    public static Map<String, String> getQueryMap(String queryString) {
        if (StringUtils.isNotBlank(queryString)) {
            final String params = StrUtil.subAfter(queryString, "?", true);
            if (StringUtils.isBlank(params)) {
                return Collections.emptyMap();
            }
            return Arrays.stream(params.split("&")).map(item -> item.split("="))
                    .collect(Collectors.toMap(key -> key[0], value -> value.length > 1 && StringUtils.isNotBlank(value[1]) ? value[1] : "", (s, s2) -> s));
        }
        return Collections.emptyMap();
    }
}
