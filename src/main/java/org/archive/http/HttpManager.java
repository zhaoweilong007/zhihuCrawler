package org.archive.http;


import org.apache.commons.io.IOUtils;
import org.apache.http.HttpHost;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.config.AuthSchemes;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.apache.http.util.EntityUtils;
import org.archive.constant.CrawlerConstants;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.proxy.Proxy;
import us.codecraft.webmagic.selector.Html;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.List;

/**
 * @author ZhaoWeiLong
 */
public class HttpManager {

    /**
     * 全局连接池对象
     */
    private static PoolingHttpClientConnectionManager connManager = null;

    /**
     * 配置连接池信息，支持http/https
     */
    static {
        SSLContext sslcontext = null;
        try {
            //获取TLS安全协议上下文
            sslcontext = SSLContext.getInstance("TLS");
            sslcontext.init(null, new TrustManager[]{new X509TrustManager() {
                @Override
                public void checkClientTrusted(X509Certificate[] arg0, String arg1) {
                }

                @Override
                public void checkServerTrusted(X509Certificate[] arg0, String arg1) {
                }

                @Override
                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[]{};
                }
            }}, null);

            SSLConnectionSocketFactory scsf = new SSLConnectionSocketFactory(sslcontext, NoopHostnameVerifier.INSTANCE);
            RequestConfig defaultConfig = RequestConfig.custom().setCookieSpec(CookieSpecs.STANDARD_STRICT)
                    .setExpectContinueEnabled(true)
                    .setTargetPreferredAuthSchemes(List.of(AuthSchemes.NTLM, AuthSchemes.DIGEST))
                    .setProxyPreferredAuthSchemes(List.of(AuthSchemes.BASIC)).build();
            Registry<ConnectionSocketFactory> sfr = RegistryBuilder.<ConnectionSocketFactory>create()
                    .register("http", PlainConnectionSocketFactory.INSTANCE)
                    .register("https", scsf).build();

            connManager = new PoolingHttpClientConnectionManager(sfr);
            // 设置最大连接数
            connManager.setMaxTotal(200);
            // 设置每个连接的路由数
            connManager.setDefaultMaxPerRoute(20);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        }
    }

    private HttpManager() {
    }

    public static HttpManager get() {
        return Holder.MANAGER;
    }

    private static class Holder {
        private static final HttpManager MANAGER = new HttpManager();
    }

    /**
     * 创建新的HttpClient
     *
     * @return
     */
    public CloseableHttpClient createHttpClient() {

        return createHttpClient(20000, null, null);
    }

    /**
     * 获取Http客户端连接对象
     *
     * @param timeOut 超时时间
     * @param proxy   代理
     * @param cookie  Cookie
     * @return Http客户端连接对象
     */
    public CloseableHttpClient createHttpClient(int timeOut, HttpHost proxy, BasicClientCookie cookie) {

        // 创建Http请求配置参数
        RequestConfig.Builder builder = RequestConfig.custom()
                // 获取连接超时时间
                .setConnectionRequestTimeout(timeOut)
                // 请求超时时间
                .setConnectTimeout(timeOut)
                // 响应超时时间
                .setSocketTimeout(timeOut)
                .setCookieSpec(CookieSpecs.STANDARD);

        if (proxy != null) {
            builder.setProxy(proxy);
        }

        RequestConfig requestConfig = builder.build();

        // 创建httpClient
        HttpClientBuilder httpClientBuilder = HttpClients.custom();

        httpClientBuilder
                // 把请求相关的超时信息设置到连接客户端
                .setDefaultRequestConfig(requestConfig)
                // 把请求重试设置到连接客户端
                .setRetryHandler(new RetryHandler())
                // 配置连接池管理对象
                .setConnectionManager(connManager);

        if (cookie != null) {
            CookieStore cookieStore = new BasicCookieStore();
            cookieStore.addCookie(cookie);
            httpClientBuilder.setDefaultCookieStore(cookieStore);
        }

        return httpClientBuilder.build();
    }

    public CloseableHttpResponse getResponse(String url) {

        return getResponse(url, null);
    }

    public CloseableHttpResponse getResponse(String url, Proxy proxy) {

        HttpGet request = new HttpGet(url);
        return getResponse(request, proxy);
    }

    public CloseableHttpResponse getResponse(HttpRequestBase request, Proxy proxy) {

        request.setHeader("User-Agent", CrawlerConstants.getUserAgent());
        HttpClientContext httpClientContext = HttpClientContext.create();
        CloseableHttpResponse response = null;

        try {

            if (proxy == null) {

                response = createHttpClient().execute(request, httpClientContext);
            } else {
                final HttpHost httpHost = new HttpHost(proxy.getHost(), proxy.getPort(), proxy.getScheme());
                response = createHttpClient(20000, httpHost, null).execute(request, httpClientContext);
            }

        } catch (NoHttpResponseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return response;
    }

    public boolean checkProxy(Proxy proxy) {

        if (proxy == null) return false;

        Socket socket = null;
        try {
            socket = new Socket();
            InetSocketAddress endpointSocketAddr = new InetSocketAddress(proxy.getHost(), proxy.getPort());
            socket.connect(endpointSocketAddr, 3000);
            return true;
        } catch (IOException e) {
            return false;
        } finally {

            IOUtils.closeQuietly(socket);
        }
    }

    public boolean checkProxy(HttpHost proxy) {

        if (proxy == null) return false;

        Socket socket = null;
        try {
            socket = new Socket();
            InetSocketAddress endpointSocketAddr = new InetSocketAddress(proxy.getHostName(), proxy.getPort());
            socket.connect(endpointSocketAddr, 3000);
            return true;
        } catch (IOException e) {
            return false;
        } finally {

            IOUtils.closeQuietly(socket);
        }
    }

    public Page getWebPage(String url) throws IOException {

        return getWebPage(url, "UTF-8", null);
    }

    public Page getWebPage(String url, Proxy proxy) throws IOException {

        return getWebPage(url, "UTF-8", proxy);
    }

    public Page getWebPage(String url, String charset, Proxy proxy) throws IOException {

        Page page = new Page();

        CloseableHttpResponse response = null;

        if (proxy == null) {

            response = HttpManager.get().getResponse(url);
        } else {

            response = HttpManager.get().getResponse(url, proxy);
        }

        if (response != null) {
            page.setStatusCode(response.getStatusLine().getStatusCode());
            page.setRequest(new Request(url));
            try {
                if (page.getStatusCode() == 200) {
                    page.setHtml(Html.create(EntityUtils.toString(response.getEntity(), charset)));
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                IOUtils.closeQuietly(response);
            }
        } else { // response is null

            page.setRequest(new Request(url));
        }

        return page;
    }
}
