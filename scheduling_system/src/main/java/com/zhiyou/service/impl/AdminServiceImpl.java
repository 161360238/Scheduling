package com.zhiyou.service.impl;

import com.zhiyou.mapper.AdminMapper;
import com.zhiyou.pojo.Admin;
import com.zhiyou.pojo.AdminExample;
import com.zhiyou.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Auther: http://wangjie
 * @Date: 2019/8/6
 * @Description: com.zhiyou.server
 * @version: 1.0
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin getAdminInfo(String id) {
        AdminExample adminExample = new AdminExample();
        adminExample.createCriteria().andImoocIdEqualTo(Long.parseLong(id));
        List<Admin> admins = adminMapper.selectByExample(adminExample);
        if (admins != null && admins.size() > 0) {
            return admins.get(0);
        } else {
            return null;
        }
    }

    /**
     * 查询管理员信息
     *
     * @return
     */
    @Override
    public List<Admin> getAll() {
        AdminExample adminExample = new AdminExample();
        return adminMapper.selectByExample(adminExample);

    }

    /**
     * 根据id更新管理员信息
     *
     * @param admin
     * @return
     */
    @Override
    public int updateAdminById(Admin admin) {
        int result = adminMapper.updateByPrimaryKeySelective(admin);
        return result;
    }


    /**
     * 新增管理员用户
     *
     * @param admin
     * @return
     */
    @Override
    public int addAdmin(Admin admin) {
        int result = adminMapper.insertSelective(admin);
        return result;
    }

    /**
     * 根据id删除用户
     *
     * @param id
     * @return
     */
    @Override
    public int deleteAdminById(String id) {
        int result = adminMapper.deleteByPrimaryKey(Long.parseLong(id));
        return result;
    }

    /**
     * 根据用户名查询用户
     *
     * @param username
     * @return
     */
    @Override
    public Admin selectAdminByName(String username) {

        AdminExample adminExample = new AdminExample();
        adminExample.createCriteria().andImoocUsernameEqualTo(username);
        List<Admin> admins = adminMapper.selectByExample(adminExample);
        if (admins != null && admins.size() >= 0) {
            return admins.get(0);
        } else {
            return null;
        }
    }
}
