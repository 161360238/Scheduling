package com.zhiyou.service;

import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: http://wangjie
 * @Date: 2019/8/7
 * @Description: com.zhiyou.service
 * @version: 1.0
 */
public interface RbacService {
    boolean hasPermission(HttpServletRequest request, Authentication authentication);
}
