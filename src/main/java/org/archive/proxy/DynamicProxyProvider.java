package org.archive.proxy;

import lombok.RequiredArgsConstructor;
import org.archive.properties.ProxyProperties;
import redis.clients.jedis.JedisPool;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.proxy.Proxy;
import us.codecraft.webmagic.proxy.ProxyProvider;

/**
 * 动态ip代理池
 *
 * @author ZhaoWeiLong
 **/
@RequiredArgsConstructor
public class DynamicProxyProvider implements ProxyProvider {

    private final JedisPool jedisPool;
    private final ProxyProperties properties;


    public static DynamicProxyProvider from(JedisPool jedisPool, ProxyProperties properties) {

        return new DynamicProxyProvider(jedisPool, properties);
    }


    @Override
    public void returnProxy(Proxy proxy, Page page, Task task) {

    }
}
