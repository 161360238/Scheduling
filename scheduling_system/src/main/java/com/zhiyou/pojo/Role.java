package com.zhiyou.pojo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Role {
    private Long imoocId;

    private Date imoocCreatedtime;

    private String imoocName;

    //角色拥有权限集合，一对多
    private Set<Roleresource> resources=new HashSet<>();

    //角色用户的集合，一对多
    private Set<Roleadmin> admins=new HashSet<>();

    public Set<Roleresource> getResources() {
        return resources;
    }

    public void setResources(Set<Roleresource> resources) {
        this.resources = resources;
    }

    public Set<Roleadmin> getAdmins() {
        return admins;
    }

    public void setAdmins(Set<Roleadmin> admins) {
        this.admins = admins;
    }




    public Long getImoocId() {
        return imoocId;
    }

    public void setImoocId(Long imoocId) {
        this.imoocId = imoocId;
    }

    public Date getImoocCreatedtime() {
        return imoocCreatedtime;
    }

    public void setImoocCreatedtime(Date imoocCreatedtime) {
        this.imoocCreatedtime = imoocCreatedtime;
    }

    public String getImoocName() {
        return imoocName;
    }

    public void setImoocName(String imoocName) {
        this.imoocName = imoocName == null ? null : imoocName.trim();
    }
}