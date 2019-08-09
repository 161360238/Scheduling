package com.zhiyou.security.authentication;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.zhiyou.security.properties.LoginType;
import com.zhiyou.security.properties.SecurityProperties;
import com.zhiyou.suport.SimpleResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: http://wangjie
 * @Date: 2019/7/22
 * @Description: com.wj.security.browser.authentication
 * 失败处理的handler
 * @version: 1.0
 */
@Component("wjAuthenticationFailureHandler")
public class WjAuthenticationFailureHandler extends SimpleUrlAuthenticationFailureHandler {

    private Logger logger= LoggerFactory.getLogger(getClass());

    //json转换工具
    @Autowired
    private ObjectMapper objectMapper;

    //总属性配置文件
    @Autowired
    private SecurityProperties securityProperties;

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response
            , AuthenticationException exception) throws IOException, ServletException {
            logger.info("登录失败");
            //如果需要返回JSON
            if (LoginType.JSON.equals(securityProperties.getBrowser().getLoginType())){
                //服务器处理失败异常
                response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
                response.setContentType("application/json;charset=UTF-8");
                response.getWriter().write(objectMapper.writeValueAsString(new SimpleResponse(exception.getMessage())));
            }else{
                //如果需要跳转页面
                super.onAuthenticationFailure(request,response,exception);
            }

    }
}
