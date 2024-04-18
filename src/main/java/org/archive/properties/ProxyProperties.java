package org.archive.properties;

import lombok.Data;
import us.codecraft.webmagic.proxy.Proxy;

import java.util.List;

/**
 * @author ZhaoWeiLong
 * @description
 **/
@Data
public class ProxyProperties {

    private Boolean enable = false;

    private List<Proxy> proxies;

}
