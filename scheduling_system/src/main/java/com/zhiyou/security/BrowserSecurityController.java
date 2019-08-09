package com.zhiyou.security;

import com.zhiyou.security.properties.SecurityProperties;
import com.zhiyou.suport.SimpleResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.security.web.savedrequest.SavedRequest;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: http://wangjie
 * @Date: 2019/7/22
 * @Description: com.wj.security.browser
 * 当需要身份认证时 跳转到这里
 * @version: 1.0
 */
@RestController
@Api(value = "BrowserSecurityController", tags = "SpringSecurity处理身份认证的Controller")
public class BrowserSecurityController {

    private Logger logger = LoggerFactory.getLogger(getClass());
    //请求缓存 从中获取刚刚的请求信息
    private RequestCache requestCache = new HttpSessionRequestCache();

    //进行url重定向
    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    //总属性配置文件
    @Autowired
    private SecurityProperties securityProperties;

    /**
     * 当用户需要进行身份·认证时 跳转到这里，
     * 根据请求格式 跳转到登录页面 或者返回一串json信息 进行提示
     *
     * @param request
     * @param response
     * @return
     */
    @ApiOperation(value = "当用户需要进行身份认证的时候，跳转到这个处理器，根据需要返回页面或者JSON")
    @RequestMapping("/authentication/require")
    @ResponseStatus(code = HttpStatus.UNAUTHORIZED)  //返回401状态码
    public SimpleResponse requireAuthentication(HttpServletRequest request, HttpServletResponse response) throws IOException {

        SavedRequest savedRequest = requestCache.getRequest(request, response);
        if (savedRequest != null) {
            String targetUrl = savedRequest.getRedirectUrl();
            logger.info("引发跳转的请求是" + targetUrl);
            if (StringUtils.endsWithIgnoreCase(targetUrl, ".html")) {
                //需要跳转到页面进行认证
                redirectStrategy.sendRedirect(request, response, securityProperties.getBrowser().getLoginPage());
            }
        }
        return new SimpleResponse("用户需要认证，请引导用户去登录页面");
    }
}
