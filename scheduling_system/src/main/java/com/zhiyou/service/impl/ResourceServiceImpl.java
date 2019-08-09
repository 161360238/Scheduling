package com.zhiyou.service.impl;

import com.zhiyou.mapper.ResourceMapper;
import com.zhiyou.pojo.Resource;
import com.zhiyou.pojo.ResourceExample;
import com.zhiyou.service.ResourceService;
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
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    private ResourceMapper resourceMapper;

    @Override
    public Resource getResourceInfo(String id) {
        ResourceExample resourceExample = new ResourceExample();
        resourceExample.createCriteria().andImoocIdEqualTo(Long.parseLong(id));
        List<Resource> admins = resourceMapper.selectByExample(resourceExample);
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
    public List<Resource> getAll() {
        ResourceExample resourceExample = new ResourceExample();
        return resourceMapper.selectByExample(resourceExample);

    }

    /**
     * 根据id更新管理员信息
     *
     * @param resource
     * @return
     */
    @Override
    public int uodateResourceById(Resource resource) {
        int result = resourceMapper.updateByPrimaryKeySelective(resource);
        return result;
    }


    /**
     * 新增管理员用户
     *
     * @param admin
     * @return
     */
    @Override
    public int addResource(Resource admin) {
        int result = resourceMapper.insertSelective(admin);
        return result;
    }

    /**
     * 根据id删除用户
     *
     * @param id
     * @return
     */
    @Override
    public int deleteResourceById(String id) {
        int result = resourceMapper.deleteByPrimaryKey(Long.parseLong(id));
        return result;
    }
}
