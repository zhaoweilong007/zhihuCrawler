package org.archive.utils;

import okhttp3.*;
import org.apache.commons.lang3.StringUtils;
import org.archive.model.ProxyEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

/**
 * @author ZhaoWeiLong
 **/
public class VerifyUtil {

    private static final Logger log = LoggerFactory.getLogger(VerifyUtil.class);

    private static final String URL = "https://www.baidu.com/";

    static final Request BAIDU_REQUEST = new Request.Builder().url(URL).get().build();

    private static final OkHttpClient client = new OkHttpClient.Builder().dispatcher(new Dispatcher())
            .connectTimeout(2000, TimeUnit.MILLISECONDS).build();


    public static boolean verify(ProxyEntity x) {
        boolean res = false;
        try {
            res = verify(x.getHost(), x.getPort(), x.getType(), x.getUsername(), x.getPassword());
        } catch (Exception e) {
            log.error("校验代理ip异常", e);
        }
        return res;
    }

    public static boolean verify(String host, Integer port, String type, String username, String password) {
        assert StringUtils.isNotBlank(host);
        assert 0 < port && port < 65536;
        assert StringUtils.isNotBlank(type);

        Proxy.Type proxyType;
        if ("http".equalsIgnoreCase(type) || "https".equalsIgnoreCase(type)) {
            proxyType = Proxy.Type.HTTP;
        } else if ("socket".equalsIgnoreCase(type)) {
            proxyType = Proxy.Type.SOCKS;
        } else {
            proxyType = Proxy.Type.HTTP;
        }

        return verify(new InetSocketAddress(host, port), proxyType, username, password);
    }

    public static boolean verify(String host, Integer port, String type) {
        assert StringUtils.isNotBlank(host);
        assert 0 < port && port < 65536;
        assert StringUtils.isNotBlank(type);

        Proxy.Type proxyType;
        if ("http".equalsIgnoreCase(type) || "https".equalsIgnoreCase(type)) {
            proxyType = Proxy.Type.HTTP;
        } else if ("socket".equalsIgnoreCase(type)) {
            proxyType = Proxy.Type.SOCKS;
        } else {
            proxyType = Proxy.Type.HTTP;
        }

        return verify(new InetSocketAddress(host, port), proxyType);
    }

    public static boolean verify(InetSocketAddress inetSocketAddress, Proxy.Type proxyType) {
        return verify(new Proxy(proxyType, inetSocketAddress));
    }

    public static boolean verify(InetSocketAddress inetSocketAddress, Proxy.Type proxyType, String username, String password) {
        return defaultVerify(new Proxy(proxyType, inetSocketAddress), username, password);
    }

    public static boolean verify(Proxy proxy) {
        return verify(proxy, VerifyUtil::defaultVerify2);
    }

    public static boolean verify(Proxy t, Predicate<Proxy> predicate) {
        return predicate.test(t);
    }

    public static boolean defaultVerify(Proxy proxy, String username, String password) {
        final OkHttpClient.Builder builder = new OkHttpClient.Builder()
                .connectTimeout(2000, TimeUnit.MILLISECONDS)
                .proxy(proxy);
        // 如果代理服务器需要认证，则设置用户名和密码
        if (username != null && password != null) {
            builder.proxyAuthenticator((route, response) -> {
                String credential = Credentials.basic(username, password);
                return response.request().newBuilder()
                        .header("Proxy-Authorization", credential)
                        .build();
            });
        }
        final Call call = builder.build().newCall(BAIDU_REQUEST);
        try (Response response = call.execute()) {
            assert response.body() != null;
            return response.isSuccessful();
        } catch (IOException e) {
            log.error("校验代理ip异常", e);
            return false;
        }
    }

    public static boolean defaultVerify2(Proxy proxy) {
        HttpURLConnection connection = null;
        try {
            URL url = new URL(URL);
            connection = (HttpURLConnection) url.openConnection(proxy);
            connection.setConnectTimeout(4 * 1000);
            connection.setInstanceFollowRedirects(false);
            connection.setReadTimeout(6 * 1000);

            return connection.getResponseCode() == 200;
        } catch (IOException e) {
            log.error("校验代理ip异常", e);
            return false;
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
}
