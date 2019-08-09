package com.zhiyou.security;

import com.zhiyou.security.authentication.WjAuthenticationFailureHandler;
import com.zhiyou.security.authentication.WjAuthenticationSuccessHandler;
import com.zhiyou.security.authorize.AuthorizeConfigManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @Auther: http://wangjie
 * @Date: 2019/8/7
 * @Description: com.zhiyou.security
 * @version: 1.0
 */
@Configuration
public class BrowserSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private WjAuthenticationFailureHandler wjAuthenticationFailureHandler;

    @Autowired
    private WjAuthenticationSuccessHandler wjAuthenticationSuccessHandler;

    @Autowired
    private AuthorizeConfigManager authorizeConfigManager;

    //配置加密工具
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
             http
                .formLogin() //使用表单登录进行认证方式
                    .loginPage("/authentication/require")  //自己指定登录页面控制器，可以自己制定登录页面或者返回json
                    .loginProcessingUrl("/authentication/form")   //自定义表单提交的url
                    .successHandler(wjAuthenticationSuccessHandler) //注册自定义认证成功处理器
                    .failureHandler(wjAuthenticationFailureHandler)  //注册自定义认证失败的处理器
                .and()
                    .csrf().disable();
        authorizeConfigManager.config(http.authorizeRequests());
    }
}
