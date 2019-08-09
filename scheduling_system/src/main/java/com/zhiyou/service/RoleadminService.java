package com.zhiyou.service;

import com.zhiyou.pojo.Resource;
import com.zhiyou.pojo.Role;

import java.util.List;

/**
 * @Auther: http://wangjie
 * @Date: 2019/8/8
 * @Description: com.zhiyou.service
 * @version: 1.0
 */
public interface RoleadminService {
    int setRoleForAdmin(List<Integer> roleIds, Integer adminId);
    boolean haveRole(Integer adminId, Integer integer);

    int setResourceForRole(List<Integer> resourceIds, Integer roleId);

    boolean haveResource(Integer resourceId, Integer roleId);

    List<Role> selectRoleByAdmin(Integer adminId);

    List<Resource> selectResourceByRole(Integer roleId);

    List<Resource> getTree(Integer adminId);
}
