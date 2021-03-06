package com.zwl.test;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.core.util.StrUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.LinkedListMultimap;
import com.zwl.constant.ZhiHuConstant;
import com.zwl.thread.CrawlerThreadPool;
import org.junit.Test;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * 描述：
 *
 * @author zwl
 * @since 2022/5/23 17:31
 */
public class CrawlerTest {

    public static void main(String[] args) {
        String regex = "https://www.zhihu.com/api/v4/topics/\\d+/feeds/essence\\?limit=\\d+&offset=\\d+";
        System.out.println(regex);
        String s = ReUtil.get(regex, "https://www.zhihu.com/api/v4/topics/19962850/feeds/essence?limit=10&offset=65", 0);
        System.out.println(s);

        String json =
                "{\"paging\": {\"is_end\": false, \"totals\": 0, \"previous\": \"http://www.zhihu.com/api/v3/topics/19776749/children?limit=10&offset=0\", \"is_start\": true, \"next\": \"http://www.zhihu.com/api/v3/topics/19776749/children?limit=10&offset=10\"}, \"data\": [{\"is_super_topic_vote\": true, \"name\": \"\\u300c\\u672a\\u5f52\\u7c7b\\u300d\\u8bdd\\u9898\", \"url\": \"http://www.zhihu.com/api/v3/topics/19776751\", \"excerpt\": \"\\u77e5\\u4e4e\\u7684\\u5168\\u90e8\\u8bdd\\u9898\\u901a\\u8fc7\\u7236\\u5b50\\u5173\\u7cfb\\u6784\\u6210\\u4e00\\u4e2a\\u6709\\u6839\\u65e0\\u5faa\\u73af\\u7684\\u6709\\u5411\\u56fe\\u3002 \\u6240\\u6709\\u6ca1\\u6709\\u76f4\\u63a5\\u6dfb\\u52a0\\u7236\\u8bdd\\u9898\\u7684\\u8bdd\\u9898\\u4f1a\\u81ea\\u52a8\\u6210\\u4e3a\\u300c\\u672a\\u5f52\\u7c7b\\u300d\\u8bdd\\u9898\\u7684\\u5b50\\u8bdd\\u9898\\uff0c\\u4ece\\u800c\\u4e0e\\u6574\\u4e2a\\u8bdd\\u9898\\u6811\\u8fde\\u63a5\\u8d77\\u6765\\u3002\", \"is_vote\": false, \"introduction\": \"\\u77e5\\u4e4e\\u7684\\u5168\\u90e8\\u8bdd\\u9898\\u901a\\u8fc7\\u7236\\u5b50\\u5173\\u7cfb\\u6784\\u6210\\u4e00\\u4e2a<b>\\u6709\\u6839\\u65e0\\u5faa\\u73af\\u7684\\u6709\\u5411\\u56fe<\\/b>\\u3002<br>\\u6240\\u6709\\u6ca1\\u6709\\u76f4\\u63a5\\u6dfb\\u52a0\\u7236\\u8bdd\\u9898\\u7684\\u8bdd\\u9898\\u4f1a\\u81ea\\u52a8\\u6210\\u4e3a<b>\\u300c\\u672a\\u5f52\\u7c7b\\u300d\\u8bdd\\u9898<\\/b>\\u7684\\u5b50\\u8bdd\\u9898\\uff0c\\u4ece\\u800c\\u4e0e\\u6574\\u4e2a\\u8bdd\\u9898\\u6811\\u8fde\\u63a5\\u8d77\\u6765\\u3002\", \"avatar_url\": \"https://pic3.zhimg.com/50/v2-e56dc00febff46e01d3ca601e6f0dce6_qhd.jpg?source=54b3c3a5\", \"topic_id\": 76001, \"is_black\": false, \"type\": \"topic\", \"id\": \"19776751\"}, {\"is_super_topic_vote\": true, \"name\": \"\\u5b66\\u79d1\", \"url\": \"http://www.zhihu.com/api/v3/topics/19618774\", \"excerpt\": \"\\u5b66\\u79d1\\u8be5\\u8bcd\\u6709\\u4ee5\\u4e0b\\u4e24\\u79cd\\u542b\\u4e49\\uff1a\\u2460\\u76f8\\u5bf9\\u72ec\\u7acb\\u7684\\u77e5\\u8bc6\\u4f53\\u7cfb\\u3002\\u4eba\\u7c7b\\u6240\\u6709\\u7684\\u77e5\\u8bc6\\u5212\\u5206\\u4e3a\\u4e94\\u5927\\u95e8\\u7c7b\\uff1a\\u81ea\\u7136\\u79d1\\u5b66\\uff0c\\u519c\\u4e1a\\u79d1\\u5b66\\uff0c\\u533b\\u836f\\u79d1\\u5b66\\uff0c\\u5de5\\u7a0b\\u4e0e\\u6280\\u672f\\u79d1\\u5b66\\uff0c\\u4eba\\u6587\\u4e0e\\u793e\\u4f1a\\u79d1\\u5b66\\u3002\\u2461\\u6211\\u56fd\\u9ad8\\u7b49\\u5b66\\u6821\\u672c\\u79d1\\u6559\\u80b2\\u4e13\\u4e1a\\u8bbe\\u7f6e\\u7684\\u5b66\\u79d1\\u5206\\u7c7b\\uff0c\\u6211\\u56fd\\u9ad8\\u7b49\\u6559\\u80b2\\u5212\\u5206\\u4e3a13\\u4e2a\\u5b66\\u79d1\\u95e8\\u7c7b\\uff1a\\u54f2\\u5b66\\u3001\\u7ecf\\u6d4e\\u5b66\\u3001\\u6cd5\\u5b66\\u3001\\u6559\\u80b2\\u5b66\\u3001\\u6587\\u5b66\\u3001\\u5386\\u53f2\\u5b66\\u3001\\u7406\\u5b66\\u3001\\u5de5\\u5b66\\u3001\\u519c\\u5b66\\u3001\\u533b\\u5b66\\u3001\\u519b\\u4e8b\\u5b66\\u3001\\u7ba1\\u7406\\u5b66\\u3001\\u827a\\u672f\\u5b66\\u3002\", \"is_vote\": false, \"introduction\": \"\\u5b66\\u79d1\\u8be5\\u8bcd\\u6709\\u4ee5\\u4e0b\\u4e24\\u79cd\\u542b\\u4e49\\uff1a\\u2460\\u76f8\\u5bf9\\u72ec\\u7acb\\u7684\\u77e5\\u8bc6\\u4f53\\u7cfb\\u3002\\u4eba\\u7c7b\\u6240\\u6709\\u7684\\u77e5\\u8bc6\\u5212\\u5206\\u4e3a\\u4e94\\u5927\\u95e8\\u7c7b\\uff1a\\u81ea\\u7136\\u79d1\\u5b66\\uff0c\\u519c\\u4e1a\\u79d1\\u5b66\\uff0c\\u533b\\u836f\\u79d1\\u5b66\\uff0c\\u5de5\\u7a0b\\u4e0e\\u6280\\u672f\\u79d1\\u5b66\\uff0c\\u4eba\\u6587\\u4e0e\\u793e\\u4f1a\\u79d1\\u5b66\\u3002\\u2461\\u6211\\u56fd\\u9ad8\\u7b49\\u5b66\\u6821\\u672c\\u79d1\\u6559\\u80b2\\u4e13\\u4e1a\\u8bbe\\u7f6e\\u7684\\u5b66\\u79d1\\u5206\\u7c7b\\uff0c\\u6211\\u56fd\\u9ad8\\u7b49\\u6559\\u80b2\\u5212\\u5206\\u4e3a13\\u4e2a\\u5b66\\u79d1\\u95e8\\u7c7b\\uff1a\\u54f2\\u5b66\\u3001\\u7ecf\\u6d4e\\u5b66\\u3001\\u6cd5\\u5b66\\u3001\\u6559\\u80b2\\u5b66\\u3001\\u6587\\u5b66\\u3001\\u5386\\u53f2\\u5b66\\u3001\\u7406\\u5b66\\u3001\\u5de5\\u5b66\\u3001\\u519c\\u5b66\\u3001\\u533b\\u5b66\\u3001\\u519b\\u4e8b\\u5b66\\u3001\\u7ba1\\u7406\\u5b66\\u3001\\u827a\\u672f\\u5b66\\u3002\", \"avatar_url\": \"https://pic1.zhimg.com/50/8658418bc_qhd.jpg?source=54b3c3a5\", \"topic_id\": 22908, \"is_black\": false, \"type\": \"topic\", \"id\": \"19618774\"}, {\"is_super_topic_vote\": true, \"name\": \"\\u5b9e\\u4f53\", \"url\": \"http://www.zhihu.com/api/v3/topics/19778287\", \"excerpt\": \"\\u5b9e\\u4f53\\uff08entity\\uff09\\u662f\\u6709\\u53ef\\u533a\\u522b\\u6027\\u4e14\\u72ec\\u7acb\\u5b58\\u5728\\u7684\\u67d0\\u79cd\\u4e8b\\u7269\\uff0c\\u4f46\\u5b83\\u4e0d\\u9700\\u8981\\u662f\\u7269\\u8d28\\u4e0a\\u7684\\u5b58\\u5728\\u3002\\u5c24\\u5176\\u662f\\u62bd\\u8c61\\u548c\\u6cd5\\u5f8b\\u62df\\u5236\\u4e5f\\u901a\\u5e38\\u88ab\\u89c6\\u4e3a\\u5b9e\\u4f53\\u3002\\u5b9e\\u4f53\\u53ef\\u88ab\\u770b\\u6210\\u662f\\u4e00\\u5305\\u542b\\u6709\\u5b50\\u96c6\\u7684\\u96c6\\u5408\\u3002\\u5728\\u54f2\\u5b66\\u91cc\\uff0c\\u8fd9\\u79cd\\u96c6\\u5408\\u88ab\\u79f0\\u4e3a\\u5ba2\\u4f53\\u3002\\u5b9e\\u4f53\\u53ef\\u88ab\\u4f7f\\u7528\\u6765\\u6307\\u6d89\\u67d0\\u4e2a\\u53ef\\u80fd\\u662f\\u4eba\\u3001\\u52a8\\u7269\\u3001\\u690d\\u7269\\u6216\\u771f\\u83cc\\u7b49\\u4e0d\\u4f1a\\u601d\\u8003\\u7684\\u751f\\u547d\\u3001\\u65e0\\u751f\\u547d\\u7269\\u4f53\\u6216\\u4fe1\\u5ff5\\u7b49\\u7684\\u4e8b\\u7269\\u3002\\u5728\\u8fd9\\u4e00\\u65b9\\u9762\\uff0c\\u5b9e\\u4f53\\u53ef\\u4ee5\\u88ab\\u89c6\\u4e3a\\u4e00\\u5168\\u5305\\u7684\\u8bcd\\u8bed\\u3002\\u6709\\u65f6\\uff0c\\u5b9e\\u4f53\\u88ab\\u5f53\\u505a\\u672c\\u8d28\\u7684\\u5e7f\\u4e49\\uff0c\\u4e0d\\u8bba\\u5373\\u6307\\u7684\\u662f\\u5426\\u4e3a\\u7269\\u8d28\\u4e0a\\u7684\\u5b58\\u5728\\uff0c\\u5982\\u65f6\\u5e38\\u4f1a\\u6307\\u6d89\\u5230\\u7684\\u65e0\\u7269\\u8d28\\u5f62\\u5f0f\\u7684\\u5b9e\\u4f53\\u2026\", \"is_vote\": false, \"introduction\": \"\\u5b9e\\u4f53\\uff08entity\\uff09\\u662f\\u6709\\u53ef\\u533a\\u522b\\u6027\\u4e14\\u72ec\\u7acb\\u5b58\\u5728\\u7684\\u67d0\\u79cd\\u4e8b\\u7269\\uff0c\\u4f46\\u5b83\\u4e0d\\u9700\\u8981\\u662f\\u7269\\u8d28\\u4e0a\\u7684\\u5b58\\u5728\\u3002\\u5c24\\u5176\\u662f\\u62bd\\u8c61\\u548c\\u6cd5\\u5f8b\\u62df\\u5236\\u4e5f\\u901a\\u5e38\\u88ab\\u89c6\\u4e3a\\u5b9e\\u4f53\\u3002\\u5b9e\\u4f53\\u53ef\\u88ab\\u770b\\u6210\\u662f\\u4e00\\u5305\\u542b\\u6709\\u5b50\\u96c6\\u7684\\u96c6\\u5408\\u3002\\u5728\\u54f2\\u5b66\\u91cc\\uff0c\\u8fd9\\u79cd\\u96c6\\u5408\\u88ab\\u79f0\\u4e3a\\u5ba2\\u4f53\\u3002\\u5b9e\\u4f53\\u53ef\\u88ab\\u4f7f\\u7528\\u6765\\u6307\\u6d89\\u67d0\\u4e2a\\u53ef\\u80fd\\u662f\\u4eba\\u3001\\u52a8\\u7269\\u3001\\u690d\\u7269\\u6216\\u771f\\u83cc\\u7b49\\u4e0d\\u4f1a\\u601d\\u8003\\u7684\\u751f\\u547d\\u3001\\u65e0\\u751f\\u547d\\u7269\\u4f53\\u6216\\u4fe1\\u5ff5\\u7b49\\u7684\\u4e8b\\u7269\\u3002\\u5728\\u8fd9\\u4e00\\u65b9\\u9762\\uff0c\\u5b9e\\u4f53\\u53ef\\u4ee5\\u88ab\\u89c6\\u4e3a\\u4e00\\u5168\\u5305\\u7684\\u8bcd\\u8bed\\u3002\\u6709\\u65f6\\uff0c\\u5b9e\\u4f53\\u88ab\\u5f53\\u505a\\u672c\\u8d28\\u7684\\u5e7f\\u4e49\\uff0c\\u4e0d\\u8bba\\u5373\\u6307\\u7684\\u662f\\u5426\\u4e3a\\u7269\\u8d28\\u4e0a\\u7684\\u5b58\\u5728\\uff0c\\u5982\\u65f6\\u5e38\\u4f1a\\u6307\\u6d89\\u5230\\u7684\\u65e0\\u7269\\u8d28\\u5f62\\u5f0f\\u7684\\u5b9e\\u4f53\\uff0d\\u8bed\\u8a00\\u3002\\u66f4\\u6709\\u751a\\u8005\\uff0c\\u5b9e\\u4f53\\u6709\\u65f6\\u4ea6\\u6307\\u5b58\\u5728\\u6216\\u672c\\u8d28\\u672c\\u8eab\\u3002\\u5728\\u6cd5\\u5f8b\\u4e0a\\uff0c\\u5b9e\\u4f53\\u662f\\u6307\\u80fd\\u5177\\u6709\\u6743\\u5229\\u548c\\u4e49\\u52a1\\u7684\\u4e8b\\u7269\\u3002\\u8fd9\\u901a\\u5e38\\u662f\\u6307\\u6cd5\\u4eba\\uff0c\\u4f46\\u4e5f\\u5305\\u62ec\\u81ea\\u7136\\u4eba\\u3002\\u00a0<br><b>\\u8b66\\u544a\\uff1a\\u8bf7\\u4e0d\\u8981\\u5c06\\u672c\\u8bdd\\u9898\\u5f53\\u505a\\u5e7f\\u544a\\u5ba3\\u4f20\\u7684\\u573a\\u6240\\uff0c\\u4e5f\\u4e0d\\u8981\\u5c06\\u5173\\u4e8e\\u5b9e\\u4f53\\u7ecf\\u6d4e\\u3001\\u5b9e\\u4f53\\u5e97\\u7b49\\u7684\\u63d0\\u95ee\\u76f4\\u63a5\\u7ed1\\u5b9a\\u5230\\u8be5\\u8bdd\\u9898\\u4e0a\\u3002<\\/b>\", \"avatar_url\": \"https://pic2.zhimg.com/50/37c2b84c88dea33eb4e36a1bdb558386_qhd.jpg?source=54b3c3a5\", \"topic_id\": 76518, \"is_black\": false, \"type\": \"topic\", \"id\": \"19778287\"}, {\"is_super_topic_vote\": true, \"name\": \"\\u300c\\u5f62\\u800c\\u4e0a\\u300d\\u8bdd\\u9898\", \"url\": \"http://www.zhihu.com/api/v3/topics/19778298\", \"excerpt\": \"\\u300c\\u5f62\\u800c\\u4e0a\\u300d\\u8bdd\\u9898\\u4e0b\\u6536\\u5f55\\u4e86\\u4e00\\u4e9b\\u8ba8\\u8bba\\u6982\\u5ff5\\u3001\\u903b\\u8f91\\u3001\\u542b\\u4e49\\u548c\\u539f\\u56e0\\u7b49\\u62bd\\u8c61\\u5185\\u5bb9\\u7684\\u5b50\\u8bdd\\u9898\\u3002 \\u300c\\u5f62\\u800c\\u4e0a\\u300d\\u662f\\u65e5\\u672c\\u4eba\\u4e95\\u4e0a\\u54f2\\u6b21\\u90ce\\u5bf9 metaphysic \\u4e00\\u8bcd\\u7684\\u6c49\\u5b57\\u7ffb\\u8bd1\\uff0c\\u8bed\\u51fa\\u300a\\u6613\\u7ecf\\u300b\\u4e2d\\u300c\\u5f62\\u800c\\u4e0a\\u8005\\u8c13\\u4e4b\\u9053\\uff0c\\u5f62\\u800c\\u4e0b\\u8005\\u8c13\\u4e4b\\u5668\\u300d \\u8bf7\\u4e0d\\u8981\\u5728\\u95ee\\u9898\\u4e0a\\u76f4\\u63a5\\u7ed1\\u5b9a\\u300c\\u5f62\\u800c\\u4e0a\\u300d\\u8bdd\\u9898\", \"is_vote\": false, \"introduction\": \"<b>\\u300c\\u5f62\\u800c\\u4e0a\\u300d\\u8bdd\\u9898<\\/b>\\u4e0b\\u6536\\u5f55\\u4e86\\u4e00\\u4e9b\\u8ba8\\u8bba\\u6982\\u5ff5\\u3001\\u903b\\u8f91\\u3001\\u542b\\u4e49\\u548c\\u539f\\u56e0\\u7b49\\u62bd\\u8c61\\u5185\\u5bb9\\u7684\\u5b50\\u8bdd\\u9898\\u3002<br><br>\\u300c\\u5f62\\u800c\\u4e0a\\u300d\\u662f\\u65e5\\u672c\\u4eba\\u4e95\\u4e0a\\u54f2\\u6b21\\u90ce\\u5bf9 metaphysic \\u4e00\\u8bcd\\u7684\\u6c49\\u5b57\\u7ffb\\u8bd1\\uff0c\\u8bed\\u51fa\\u300a\\u6613\\u7ecf\\u300b\\u4e2d\\u300c\\u5f62\\u800c\\u4e0a\\u8005\\u8c13\\u4e4b\\u9053\\uff0c\\u5f62\\u800c\\u4e0b\\u8005\\u8c13\\u4e4b\\u5668\\u300d<br><br><i>\\u8bf7\\u4e0d\\u8981\\u5728\\u95ee\\u9898\\u4e0a\\u76f4\\u63a5\\u7ed1\\u5b9a\\u300c\\u5f62\\u800c\\u4e0a\\u300d\\u8bdd\\u9898<\\/i>\", \"avatar_url\": \"https://pic1.zhimg.com/50/b8cc2ef70_qhd.jpg?source=54b3c3a5\", \"topic_id\": 76521, \"is_black\": false, \"type\": \"topic\", \"id\": \"19778298\"}, {\"category\": \"n_wiki\", \"is_super_topic_vote\": true, \"name\": \"\\u4ea7\\u4e1a\", \"url\": \"http://www.zhihu.com/api/v3/topics/19560891\", \"excerpt\": \"\\u4ea7\\u4e1a\\u662f\\u793e\\u4f1a\\u5206\\u5de5\\u548c\\u751f\\u4ea7\\u529b\\u4e0d\\u65ad\\u53d1\\u5c55\\u7684\\u4ea7\\u7269\\u3002\\u4ea7\\u4e1a\\u662f\\u793e\\u4f1a\\u5206\\u5de5\\u7684\\u4ea7\\u7269\\uff0c\\u5b83\\u968f\\u7740\\u793e\\u4f1a\\u5206\\u5de5\\u7684\\u4ea7\\u751f\\u800c\\u4ea7\\u751f\\uff0c\\u5e76\\u968f\\u7740\\u793e\\u4f1a\\u5206\\u5de5\\u7684\\u53d1\\u5c55\\u800c\\u53d1\\u5c55\\u3002\\u5728\\u8fdc\\u53e4\\u65f6\\u4ee3\\uff0c\\u4eba\\u7c7b\\u5171\\u540c\\u52b3\\u52a8\\uff0c\\u5171\\u540c\\u751f\\u6d3b\\u3002\", \"is_vote\": false, \"introduction\": \"\\u4ea7\\u4e1a\\u662f\\u793e\\u4f1a\\u5206\\u5de5\\u548c\\u751f\\u4ea7\\u529b\\u4e0d\\u65ad\\u53d1\\u5c55\\u7684\\u4ea7\\u7269\\u3002\\u4ea7\\u4e1a\\u662f\\u793e\\u4f1a\\u5206\\u5de5\\u7684\\u4ea7\\u7269\\uff0c\\u5b83\\u968f\\u7740\\u793e\\u4f1a\\u5206\\u5de5\\u7684\\u4ea7\\u751f\\u800c\\u4ea7\\u751f\\uff0c\\u5e76\\u968f\\u7740\\u793e\\u4f1a\\u5206\\u5de5\\u7684\\u53d1\\u5c55\\u800c\\u53d1\\u5c55\\u3002\\u5728\\u8fdc\\u53e4\\u65f6\\u4ee3\\uff0c\\u4eba\\u7c7b\\u5171\\u540c\\u52b3\\u52a8\\uff0c\\u5171\\u540c\\u751f\\u6d3b\\u3002\", \"avatar_url\": \"https://pic3.zhimg.com/50/358d89bd7de70e5891d5fd47138ff242_qhd.jpg?source=54b3c3a5\", \"topic_id\": 3564, \"is_black\": false, \"type\": \"topic\", \"id\": \"19560891\"}, {\"is_super_topic_vote\": true, \"name\": \"\\u751f\\u6d3b\\u3001\\u827a\\u672f\\u3001\\u6587\\u5316\\u4e0e\\u6d3b\\u52a8\", \"url\": \"http://www.zhihu.com/api/v3/topics/19778317\", \"excerpt\": \"\\u4ee5\\u4eba\\u7c7b\\u96c6\\u4f53\\u884c\\u4e3a\\u548c\\u4eba\\u7c7b\\u793e\\u4f1a\\u6587\\u660e\\u4e3a\\u4e3b\\u4f53\\u7684\\u8bdd\\u9898\\uff0c\\u5176\\u5185\\u5bb9\\u4e3b\\u8981\\u5305\\u542b\\u751f\\u6d3b\\u3001\\u827a\\u672f\\u3001\\u6587\\u5316\\u3001\\u6d3b\\u52a8\\u56db\\u4e2a\\u65b9\\u9762\\u3002\", \"is_vote\": false, \"introduction\": \"\\u4ee5\\u4eba\\u7c7b\\u96c6\\u4f53\\u884c\\u4e3a\\u548c\\u4eba\\u7c7b\\u793e\\u4f1a\\u6587\\u660e\\u4e3a\\u4e3b\\u4f53\\u7684\\u8bdd\\u9898\\uff0c\\u5176\\u5185\\u5bb9\\u4e3b\\u8981\\u5305\\u542b\\u751f\\u6d3b\\u3001\\u827a\\u672f\\u3001\\u6587\\u5316\\u3001\\u6d3b\\u52a8\\u56db\\u4e2a\\u65b9\\u9762\\u3002\", \"avatar_url\": \"https://pic3.zhimg.com/50/6df49c633_qhd.jpg?source=54b3c3a5\", \"topic_id\": 76527, \"is_black\": false, \"type\": \"topic\", \"id\": \"19778317\"}]}";

        JSONObject jsonObject = JSON.parseObject(json);
        System.out.println(jsonObject.toString());
        System.out.println("==========================================================");
        System.out.println("https:\\/\\/www.zhihu.com\\/account\\/unhuman?type=unhuman&message=%E7%B3%BB%E7%BB%9F%E7%9B%91%E6%B5%8B%E5%88%B0%E6%82%A8%E7%9A%84%E7%BD%91%E7%BB%9C%E7%8E%AF%E5%A2%83%E5%AD%98%E5%9C%A8%E5%BC%82%E5%B8%B8%EF%BC%8C%E4%B8%BA%E4%BF%9D%E8%AF%81%E6%82%A8%E7%9A%84%E6%AD%A3%E5%B8%B8%E8%AE%BF%E9%97%AE%EF%BC%8C%E8%AF%B7%E8%BE%93%E5%85%A5%E9%AA%8C%E8%AF%81%E7%A0%81%E8%BF%9B%E8%A1%8C%E9%AA%8C%E8%AF%81%E3%80%82&need_login=false".replace("\\", ""));

    }

    @Test
    public void test() {
        System.out.println(StrUtil.format(ZhiHuConstant.TOPIC_PARAM, 123123, 12));
    }


    @Test
    public void spiltCookie() {
        LinkedListMultimap<String, Object> linkedListMultimap = LinkedListMultimap
                .<String, Object>create();
        linkedListMultimap.put("123", "123456");
        linkedListMultimap.put("123", "123456");
        linkedListMultimap.put("123", "456789");
        linkedListMultimap.put("123", "987654");
        linkedListMultimap.put("123", "321654");
        for (Map.Entry<String, Object> entry : linkedListMultimap.entries()) {
            System.out.println("key=" + entry.getKey() + "value=" + entry.getValue());
        }
    }


    @Test
    public void stream() throws InterruptedException {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        new Thread(() -> {
            while (true) {
                list.add(RandomUtil.randomString(5));
            }
        }).start();

        TimeUnit.SECONDS.sleep(5);

        List<String> strs = list.stream().filter(s -> s.startsWith("a")).toList();
        System.out.println(strs);
    }

    @Test
    public void test1() {
        ArrayList<String> list = new ArrayList<>();
        String s = Optional.ofNullable(list)
                .filter(arrayList -> arrayList.size() > 0)
                .map(arrayList -> arrayList.get(0))
                .orElseThrow(() -> new RuntimeException("数据为空"));
        System.out.println(s);
    }

    @Test
    public void threadTest() throws InterruptedException {
        CrawlerThreadPool crawlerThreadPool = new CrawlerThreadPool(3);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        for (int i = 0; i < 100; i++) {
            crawlerThreadPool.submit(() -> {
                try {
                    countDownLatch.await();
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println(DateUtil.now().toString() + ",threadName=" + Thread.currentThread().getName());
            });
        }
        countDownLatch.countDown();

        TimeUnit.SECONDS.sleep(Integer.MAX_VALUE);
    }


    @Test
    public void keySet() {
        HashMap<String, String> map = new HashMap<>() {{
            put("1", "1");
            put("2", "2");
            put("3", "3");
        }};

        map.keySet().forEach(map::remove);
        System.out.println(map);
    }


}
