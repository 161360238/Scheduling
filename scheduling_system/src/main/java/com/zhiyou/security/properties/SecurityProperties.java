package com.zhiyou.security.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Auther: http://wangjie
 * @Date: 2019/8/7
 * @Description: com.zhiyou.security.properties
 * @version: 1.0
 */
@ConfigurationProperties(prefix = "wj.security")
public class SecurityProperties {
    private BrowserProperties browser=new BrowserProperties();

    public BrowserProperties getBrowser() {
        return browser;
    }

    public void setBrowser(BrowserProperties browser) {
        this.browser = browser;
    }
}
