package com.zhiyou.security.authorize;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;

/**
 * @Auther: http://wangjie
 * @Date: 2019/7/27
 * @Description: com.wj.security.core.authorize
 * 收集信息管理器
 * 用于收集系统中所有AuthorizeConfigProvider 并加载其配置
 *
 * @version: 1.0
 */
public interface AuthorizeConfigManager {
    void config(ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry config);

}
