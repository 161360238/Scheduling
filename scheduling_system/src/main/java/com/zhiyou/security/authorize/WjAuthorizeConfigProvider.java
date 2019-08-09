package com.zhiyou.security.authorize;

import com.zhiyou.security.properties.SecurityProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.stereotype.Component;

/**
 * @Auther: http://wangjie
 * @Date: 2019/7/27
 * @Description: com.wj.security.core.authorize
 * @version: 1.0
 */
@Component
@Order(Integer.MIN_VALUE)
public class WjAuthorizeConfigProvider implements AuthorizeConfigProvider {

    @Autowired
    private SecurityProperties securityProperties;

    @Override
    public boolean config(ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry config) {

        config.antMatchers("/authentication/require" //放行自定义登录页面的控制器
                //securityProperties.getBrowser().getLoginPage()
                , "/authentication/form"
                , "/swagger-ui.html"
                , "/swagger-resources/configuration/ui"
                , "/swagger-resources/configuration/security"
                , "/swagger-resources"
                , "/webjars/springfox-swagger-ui/*"
                , "/v2/api-docs"
                ,"/authority/login.action"
                , "/code/image"     //图片验证码请求
                , "/code/sms"      //短信验证码请求
        ).permitAll()  //放行这些页面

        .and();
       // config.antMatchers("/user/1").hasRole("ADMIN");
        /*if (StringUtils.isNotBlank(securityProperties.getBrowser().getSignOutUrl())) {
            config.antMatchers(securityProperties.getBrowser().getSignOutUrl()).permitAll();
        } */
        return false;
    }
}
