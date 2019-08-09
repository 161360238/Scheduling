package com.zhiyou.security;

import com.zhiyou.mapper.*;
import com.zhiyou.pojo.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @Auther: http://wangjie
 * @Date: 2019/8/8
 * @Description: com.zhiyou.security
 * @version: 1.0
 */
@Component
public class AuthenticationUtils {

    @Autowired
    private MyResourceMapper myResourceMapper;
    @Autowired
    private RoleadminMapper roleadminMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private RoleresourceMapper roleresourceMapper;
    @Autowired
    private ResourceUrlsMapper resourceUrlsMapper;
    private Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 根据admin得到role
     *
     * @param admin
     * @return
     */
    public List<Role> getRoleByAdmin(Admin admin) {
        RoleadminExample roleadminExample = new RoleadminExample();
        roleadminExample.createCriteria().andImoocAdminImoocIdEqualTo(admin.getImoocId());
        List<Roleadmin> roleadmins = roleadminMapper.selectByExample(roleadminExample);
        List<Role> roles = new ArrayList<>();
        for (int i = 0; i < roleadmins.size(); i++) {
            roles.add(roleMapper.selectByPrimaryKey(roleadmins.get(i).getImoocRoleImoocId()));
        }
        return roles;
    }

    /**
     * 根据role获取Roleresource
     *
     * @param resources 存放所有的资源对象
     * @param roles     用户拥有的全部角色
     */
    public void getResourceByRole(List<Resource> resources, List<Role> roles) {
        List<Resource> resourceList = new ArrayList<>();  //刚从数据库查到的roles对应的resource对象，后面还需要进行递归
        for (int i = 0; i < roles.size(); i++) {
            RoleresourceExample roleresourceExample = new RoleresourceExample();
            Long id = roles.get(i).getImoocId();

            roleresourceExample.createCriteria().andImoocRoleImoocIdEqualTo(id);
            List<Roleresource> roleresources = roleresourceMapper.selectByExample(roleresourceExample);

            for (int j = 0; j < roleresources.size(); j++) {
                Roleresource roleresource = roleresources.get(j);
                //根据resource主键，查询resource（需要递归）
                //resources.add(resourceMapper.selectByPrimaryKey(roleresource.getImoocResourceImoocId()));
                Resource resources1 = null;
                resources1 = myResourceMapper.loopSelectByPremaryKey(roleresource.getImoocResourceImoocId());
                resourceList.add(resources1);
            }
        }
        for (int i = 0; i < resourceList.size(); i++) {
            List<Resource> resources2 = new ArrayList<>();
            loopGetResource(resourceList.get(i), resources2);
            resources.addAll(resources2);
        }
    }

    /**
     * 据resource对象，获取到最终的url
     *
     * @param resources
     * @param urls      存放最终的url
     */
    public void getUrlsByResource(List<Resource> resources, List<String> urls) {
        for (int i = 0; i < resources.size(); i++) {
            ResourceUrlsExample resourceUrlsExample = new ResourceUrlsExample();
            resourceUrlsExample.createCriteria().andImoocResourceImoocIdEqualTo(resources.get(i).getImoocId());
            List<ResourceUrls> resourceUrls = resourceUrlsMapper.selectByExample(resourceUrlsExample);
            for (int j = 0; j < resourceUrls.size(); j++) {
                urls.add(resourceUrls.get(j).getImoocUrls());
            }
        }
    }

    /**
     * 递归获取resource的所有子节点以及当前节点
     *
     * @param resource  需要递归的对象
     * @param resources 存储递归得到的对象以及childs里面的对象
     */
    public void loopGetResource(Resource resource, List<Resource> resources) {
        Resource resource1 = new Resource();
        BeanUtils.copyProperties(resource, resource1);
        resource1.setImoocId(resource.getImoocId());
        resources.add(resource1);
        for (int i = 0; i < resource.getChilds().size(); i++) {
            loopGetResource(resource.getChilds().get(i), resources);
        }
    }

    /**
     * 为admin加urls信息
     *
     * @param admin
     */
    public void loadUrls(Admin admin) {
        //先根据admin获取这个admin的角色
        List<Role> roles = getRoleByAdmin(admin);

        //根据角色，获取所有角色的资源信息
        if (roles != null && roles.size() > 0) {

            List<Resource> resources = new ArrayList<>();  //最终经过递归查询得到的所有resources
            List<String> urls = new ArrayList<>();   //存储最终的urls
            //根据role获取Roleresource
            getResourceByRole(resources, roles);

            //根据resource对象，获取到最终的url
            getUrlsByResource(resources, urls);
            //把urls设置到admin中
            admin.setUrls(new HashSet<>(urls));
        } else {
            logger.info("没有角色");
        }
    }

    /**
     * 根据role获取树形Resource列表
     *
     * @param roles     用户拥有的全部角色
     */
    public List<Resource> getResourceByRole2(List<Role> roles) {
        List<Resource> resourceList = new ArrayList<>();  //刚从数据库查到的roles对应的resource对象，后面还需要进行递归
        for (int i = 0; i < roles.size(); i++) {
            RoleresourceExample roleresourceExample = new RoleresourceExample();
            Long id = roles.get(i).getImoocId();

            roleresourceExample.createCriteria().andImoocRoleImoocIdEqualTo(id);
            List<Roleresource> roleresources = roleresourceMapper.selectByExample(roleresourceExample);

            for (int j = 0; j < roleresources.size(); j++) {
                Roleresource roleresource = roleresources.get(j);
                //根据resource主键，查询resource（需要递归）
                //resources.add(resourceMapper.selectByPrimaryKey(roleresource.getImoocResourceImoocId()));
                Resource resources1 = null;
                resources1 = myResourceMapper.loopSelectByPremaryKey(roleresource.getImoocResourceImoocId());
                resourceList.add(resources1);
            }
        }
        return resourceList;
    }

}
