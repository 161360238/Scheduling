package com.zhiyou.service;

import com.zhiyou.pojo.Admin;

import java.util.List;

/**
 * @Auther: http://wangjie
 * @Date: 2019/8/6
 * @Description: com.zhiyou.server
 * @version: 1.0
 */
public interface AdminService {
    Admin getAdminInfo(String id);

    List<Admin> getAll();

    int updateAdminById(Admin admin);

    int addAdmin(Admin admin);

    int deleteAdminById(String id);

    Admin selectAdminByName(String username);
}
