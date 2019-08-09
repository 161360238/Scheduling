package com.zhiyou.service.impl;

import com.zhiyou.mapper.*;
import com.zhiyou.pojo.*;
import com.zhiyou.security.AuthenticationUtils;
import com.zhiyou.security.MyUserDetailService;
import com.zhiyou.service.RoleadminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: http://wangjie
 * @Date: 2019/8/8
 * @Description: com.zhiyou.service.impl
 * @version: 1.0
 */
@Service
public class RoleadminServiceImpl implements RoleadminService {

    @Autowired
    private RoleadminMapper roleadminMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private RoleresourceMapper roleresourceMapper;

    @Autowired
    private ResourceMapper resourceMapper;

    @Autowired
    private AuthenticationUtils authenticationUtils;

    /**
     * 为用户设置角色
     *
     * @param roleIds
     * @param adminId
     * @return
     */
    @Override
    public int setRoleForAdmin(List<Integer> roleIds, Integer adminId) {

        int result = 0;
        //把原来有，这次没有传过来的角色从数据库中删除
        RoleadminExample roleadminExample = new RoleadminExample();
        roleadminExample.createCriteria().andImoocAdminImoocIdEqualTo(Long.parseLong(adminId + ""));
        List<Roleadmin> original = roleadminMapper.selectByExample(roleadminExample);
        // List<Long> original=new ArrayList<>();
        for (int i = 0; i < original.size(); i++) {
            int flag = 0;//假设
            for (int j = 0; j < roleIds.size(); j++) {
                if (original.get(i).getImoocRoleImoocId().equals(roleIds.get(j))) {
                    flag = 1;  //如果包含，
                }
            }
            if (flag == 0) {  //表示不包含，就删除这条记录
                result += roleadminMapper.deleteByPrimaryKey(original.get(i).getImoocId());
            }
        }

        //先把新添加的角色加进去
        for (int i = 0; i < roleIds.size(); i++) {
            boolean flag = haveRole(adminId, roleIds.get(i));   //判断该用户是否已经拥有该角色
            if (flag == false) {
                Roleadmin roleadmin = new Roleadmin();
                roleadmin.setImoocAdminImoocId(Long.parseLong(adminId + ""));
                roleadmin.setImoocRoleImoocId(Long.parseLong(roleIds.get(i) + ""));
                result += roleadminMapper.insertSelective(roleadmin);
            }
        }


        return result;
    }

    /**
     * 判断用户是否已经拥有该角色
     *
     * @param adminId
     * @param roleId
     * @return
     */
    @Override
    public boolean haveRole(Integer adminId, Integer roleId) {
        RoleadminExample roleadminExample = new RoleadminExample();
        roleadminExample.createCriteria().andImoocAdminImoocIdEqualTo(Long.parseLong(adminId + ""))
                .andImoocRoleImoocIdEqualTo(Long.parseLong(roleId + ""));
        List<Roleadmin> roleadmins = roleadminMapper.selectByExample(roleadminExample);
        if (roleadmins != null && roleadmins.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 为角色设置权限
     *
     * @param resourceIds
     * @param roleId
     * @return
     */
    @Override
    public int setResourceForRole(List<Integer> resourceIds, Integer roleId) {
        int result = 0;

        //把原来有，这次没有传过来的权限从数据库中删除
        RoleresourceExample roleresourceExample = new RoleresourceExample();
        roleresourceExample.createCriteria().andImoocRoleImoocIdEqualTo(Long.parseLong(roleId + ""));
        List<Roleresource> original = roleresourceMapper.selectByExample(roleresourceExample);
        // List<Long> original=new ArrayList<>();
        for (int i = 0; i < original.size(); i++) {
            int flag = 0;//假设
            for (int j = 0; j < resourceIds.size(); j++) {
                if (original.get(i).getImoocRoleImoocId().equals(resourceIds.get(j))) {
                    flag = 1;  //如果包含，
                }
            }
            if (flag == 0) {  //表示不包含，就删除这条记录
                result += roleresourceMapper.deleteByPrimaryKey(original.get(i).getImoocId());
            }
        }
        //加入新的权限
        for (int i = 0; i < resourceIds.size(); i++) {
            Boolean flag = haveResource(resourceIds.get(i), roleId);  //判断该角色是否已经拥有该权限
            if (flag == false) {
                Roleresource roleresource = new Roleresource();
                roleresource.setImoocRoleImoocId(Long.parseLong(roleId + ""));
                roleresource.setImoocResourceImoocId(Long.parseLong(resourceIds.get(i) + ""));
                result += roleresourceMapper.insertSelective(roleresource);
            }
        }
        return result;
    }

    /**
     * 判断角色是否已经拥有该权限
     *
     * @param resourceId
     * @param roleId
     * @return
     */
    @Override
    public boolean haveResource(Integer resourceId, Integer roleId) {
        RoleresourceExample roleresourceExample = new RoleresourceExample();
        roleresourceExample.createCriteria().andImoocRoleImoocIdEqualTo(Long.parseLong(roleId + ""))
                .andImoocResourceImoocIdEqualTo(Long.parseLong(resourceId + ""));
        List<Roleresource> roleresources = roleresourceMapper.selectByExample(roleresourceExample);
        if (roleresources != null && roleresources.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 根据用户 查看用户拥有角色
     *
     * @param adminId
     * @return
     */
    @Override
    public List<Role> selectRoleByAdmin(Integer adminId) {
        RoleadminExample roleadminExample = new RoleadminExample();
        roleadminExample.createCriteria().andImoocAdminImoocIdEqualTo(Long.parseLong(adminId + ""));
        List<Roleadmin> roleadminList = roleadminMapper.selectByExample(roleadminExample);
        List<Role> roles = new ArrayList<>();
        for (int i = 0; i < roleadminList.size(); i++) {
            roles.add(roleMapper.selectByPrimaryKey(roleadminList.get(i).getImoocRoleImoocId()));
        }
        return roles;
    }

    /**
     * 根据角色 查看角色拥有权限
     *
     * @param roleId
     * @return
     */
    @Override
    public List<Resource> selectResourceByRole(Integer roleId) {
        RoleresourceExample roleresourceExample = new RoleresourceExample();
        roleresourceExample.createCriteria().andImoocRoleImoocIdEqualTo(Long.parseLong(roleId + ""));
        List<Roleresource> roleresources = roleresourceMapper.selectByExample(roleresourceExample);
        List<Resource> resources = new ArrayList<>();
        for (int i = 0; i < roleresources.size(); i++) {
            resources.add(resourceMapper.selectByPrimaryKey(roleresources.get(i).getImoocResourceImoocId()));
        }
        return resources;
    }

    /**
     * 根据用户id，查询用户可以操作的树形菜单列表
     *
     * @param adminId
     * @return
     */
    @Override
    public List<Resource> getTree(Integer adminId) {
        Admin admin = new Admin();
        admin.setImoocId(Long.parseLong(adminId + ""));
        List<Role> roles = authenticationUtils.getRoleByAdmin(admin);
        List<Resource> resources = authenticationUtils.getResourceByRole2(roles);
        return resources;
    }
}
