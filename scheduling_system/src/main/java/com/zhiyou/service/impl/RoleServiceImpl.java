package com.zhiyou.service.impl;

import com.zhiyou.mapper.AdminMapper;
import com.zhiyou.mapper.RoleMapper;
import com.zhiyou.pojo.Admin;
import com.zhiyou.pojo.AdminExample;
import com.zhiyou.pojo.Role;
import com.zhiyou.pojo.RoleExample;
import com.zhiyou.service.AdminService;
import com.zhiyou.service.RoleService;
import io.swagger.annotations.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: http://wangjie
 * @Date: 2019/8/6
 * @Description: com.zhiyou.server
 * @version: 1.0
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public Role getRoleInfo(String id) {
        RoleExample roleExample = new RoleExample();
        roleExample.createCriteria().andImoocIdEqualTo(Long.parseLong(id));
        List<Role> admins = roleMapper.selectByExample(roleExample);
        if (admins != null && admins.size() > 0) {
            return admins.get(0);
        } else {
            return null;
        }
    }

    /**
     * 查询角色信息
     *
     * @return
     */
    @Override
    public List<Role> getAll() {
        RoleExample roleExample = new RoleExample();
        return roleMapper.selectByExample(roleExample);

    }

    /**
     * 根据id更新角色信息
     *
     * @param role
     * @return
     */
    @Override
    public int uodateRoleById(Role role) {
        int result = roleMapper.updateByPrimaryKeySelective(role);
        return result;
    }


    /**
     * 新增角色用户
     *
     * @param admin
     * @return
     */
    @Override
    public int addRole(Role admin) {
        int result = roleMapper.insertSelective(admin);
        return result;
    }

    /**
     * 根据id删除用户
     *
     * @param id
     * @return
     */
    @Override
    public int deleteRoleById(String id) {
        int result = roleMapper.deleteByPrimaryKey(Long.parseLong(id));
        return result;
    }
}
