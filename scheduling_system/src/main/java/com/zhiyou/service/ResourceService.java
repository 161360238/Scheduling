package com.zhiyou.service;

import com.zhiyou.pojo.Resource;

import java.util.List;

/**
 * @Auther: http://wangjie
 * @Date: 2019/8/6
 * @Description: com.zhiyou.server
 * @version: 1.0
 */
public interface ResourceService {
    Resource getResourceInfo(String id);

    List<Resource> getAll();

    int uodateResourceById(Resource resource);

    int addResource(Resource resource);

    int deleteResourceById(String id);
}
