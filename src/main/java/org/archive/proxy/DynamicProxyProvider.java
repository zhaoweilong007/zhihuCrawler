package org.archive.proxy;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.archive.model.ProxyEntity;
import org.archive.properties.ProxyProperties;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.proxy.Proxy;
import us.codecraft.webmagic.proxy.ProxyProvider;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 动态ip代理池
 *
 * @author ZhaoWeiLong
 **/
@RequiredArgsConstructor
public class DynamicProxyProvider implements ProxyProvider {

    @Getter
    private final ProxyVerifier proxyVerifier;
    private final CopyOnWriteArrayList<Proxy> proxyList;
    private final AtomicInteger index = new AtomicInteger(0);


    public static DynamicProxyProvider from(ProxyProperties properties) {
        final List<ProxyEntity> proxys = properties.getPools().stream()
                .map(proxy -> {
                    final ProxyEntity proxyEntity = new ProxyEntity();
                    proxyEntity.setHost(proxy.getHost());
                    proxyEntity.setPort(proxy.getPort());
                    proxyEntity.setType(proxy.getScheme());
                    proxyEntity.setUsername(proxy.getUsername());
                    proxyEntity.setPassword(proxy.getPassword());
                    return proxyEntity;
                }).toList();
        final VerifyQueue verifyQueue = new VerifyQueue();
        verifyQueue.addAll(proxys);
        final CopyOnWriteArrayList<Proxy> proxyList = new CopyOnWriteArrayList<>();
        // 代理验证器持续从验证队列中获取代理，并进行验证
        final ProxyVerifier proxyValidator = ProxyVerifier.builder()
                .bind(verifyQueue)
                // 验证成功则保存
                .ifVerificationSucceeds(proxyEntity -> {
                    proxyList.addIfAbsent(buildProxy(proxyEntity));
                })
                // 验证失败则删除
                .ifVerificationFails(proxyEntity -> {
                    proxyList.remove(buildProxy(proxyEntity));
                })
                .executorService(Executors.newFixedThreadPool(10))
                .build();
        final DynamicProxyProvider proxyProvider = new DynamicProxyProvider(proxyValidator, proxyList);
        proxyProvider.getProxyVerifier().startVerify();
        return proxyProvider;

    }

    private static Proxy buildProxy(ProxyEntity proxyEntity) {
        final Proxy proxy = new Proxy(proxyEntity.getHost(), proxyEntity.getPort(), proxyEntity.getUsername(), proxyEntity.getPassword());
        proxy.setScheme(proxyEntity.getType());
        return proxy;
    }

    /**
     * 采用round robin算法来获取Proxy
     */
    @Override
    public Proxy getProxy(Request request, Task task) {
        Proxy result = null;
        if (!proxyList.isEmpty()) {
            if (index.get() > proxyList.size() - 1) {
                index.set(0);
            }
            result = proxyList.get(index.get());
            index.incrementAndGet();
        }
        return result;
    }

    @Override
    public void returnProxy(Proxy proxy, Page page, Task task) {

    }
}
