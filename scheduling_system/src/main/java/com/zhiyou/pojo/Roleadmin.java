package com.zhiyou.pojo;

import java.util.Date;

public class Roleadmin {
    private Long imoocId;

    private Date imoocCreatedtime;

    private Long imoocAdminImoocId;

    private Long imoocRoleImoocId;
    //多对一
    private Role role;

    //多对一
    private Admin admin;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
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

    public Long getImoocAdminImoocId() {
        return imoocAdminImoocId;
    }

    public void setImoocAdminImoocId(Long imoocAdminImoocId) {
        this.imoocAdminImoocId = imoocAdminImoocId;
    }

    public Long getImoocRoleImoocId() {
        return imoocRoleImoocId;
    }

    public void setImoocRoleImoocId(Long imoocRoleImoocId) {
        this.imoocRoleImoocId = imoocRoleImoocId;
    }
}