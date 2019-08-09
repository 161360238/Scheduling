package com.zhiyou.pojo;

import java.util.Date;

public class Roleresource {
    private Long imoocId;

    private Date imoocCreatedtime;

    private Long imoocResourceImoocId;

    private Long imoocRoleImoocId;

    //资源，多对一
    private Resource resource;

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    //角色，多对一
    private Role role;

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

    public Long getImoocResourceImoocId() {
        return imoocResourceImoocId;
    }

    public void setImoocResourceImoocId(Long imoocResourceImoocId) {
        this.imoocResourceImoocId = imoocResourceImoocId;
    }

    public Long getImoocRoleImoocId() {
        return imoocRoleImoocId;
    }

    public void setImoocRoleImoocId(Long imoocRoleImoocId) {
        this.imoocRoleImoocId = imoocRoleImoocId;
    }
}