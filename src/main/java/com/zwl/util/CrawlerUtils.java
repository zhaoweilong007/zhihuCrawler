package com.zwl.util;

import cn.hutool.core.util.StrUtil;
import com.zwl.constant.ZhiHuConstant;
import lombok.experimental.UtilityClass;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.model.HttpRequestBody;

import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 描述：
 *
 * @author zwl
 * @since 2022/5/24 16:58
 */
@UtilityClass
public class CrawlerUtils {

  //private static final LinkedBlockingQueue<String> REQUESTS = new LinkedBlockingQueue<>();
  //
  //public static void putReq(String request)  {
  //  REQUESTS.add(request);
  //}
  //
  //public static String pollReq() {
  //  return REQUESTS.poll();
  //}

  public static Request assemblyBody(Long topicId, Integer offset) {
    String param = StrUtil.format(ZhiHuConstant.TOPIC_PARAM, topicId, offset);
    Request request = new Request(ZhiHuConstant.TOPIC_URL);
    request.setMethod("post");
    request.setRequestBody(
        HttpRequestBody.form(
            new HashMap<String, Object>(4) {
              {
                put("method", "next");
                put("params", param);
              }
            },
            "utf-8"));
    request.setCharset("utf-8");
    return request;
  }


}
