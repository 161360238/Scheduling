package com.zhiyou.security;

import com.zhiyou.pojo.Admin;
import com.zhiyou.service.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Auther: http://wangjie
 * @Date: 2019/8/7
 * @Description: com.zhiyou.security
 * 用户自定义登录逻辑
 * @version: 1.0
 */
@Component
@Transactional
public class MyUserDetailService implements UserDetailsService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private AdminService adminService;

    @Autowired
    private AuthenticationUtils authenticationUtils;


    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        logger.info("用户" + username + "登录了");

        Admin admin = adminService.selectAdminByName(username);
        String passord = passwordEncoder.encode(admin.getPassword());
        if (admin == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        //加载用户的权限信息
        authenticationUtils.loadUrls(admin);
        return admin;
    }


}
