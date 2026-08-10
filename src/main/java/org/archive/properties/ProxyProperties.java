package org.archive.properties;

import lombok.Data;
import org.archive.model.ProxyEntity;
import us.codecraft.webmagic.proxy.Proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * 代理配置
 *
 * @author ZhaoWeiLong
 **/
@Data
public class ProxyProperties {

    private Boolean enable = false;

    /**
     * 代理ip池
     */
    private List<ProxyEntity> pools = new ArrayList<>();

}
