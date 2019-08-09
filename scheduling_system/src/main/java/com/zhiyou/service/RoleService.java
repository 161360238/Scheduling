package com.zhiyou.service;

import com.zhiyou.pojo.Role;

import java.util.List;

/**
 * @Auther: http://wangjie
 * @Date: 2019/8/6
 * @Description: com.zhiyou.server
 * @version: 1.0
 */
public interface RoleService {
    Role getRoleInfo(String id);

    List<Role> getAll();

    int uodateRoleById(Role role);

    int addRole(Role role);

    int deleteRoleById(String id);
}
