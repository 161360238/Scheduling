package com.zhiyou.pojo;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class Admin implements UserDetails, Serializable {
    private Long imoocId;

    private Date imoocCreatedtime;

    private String imoocPassword;

    private String imoocUsername;

    //用户的所有角色，一对多
    private Set<Roleadmin> roles = new HashSet<>();


    //用户有权访问的url，不持久化到数据库
    private Set<String> urls = new HashSet<>();

    //用户有权的所有资源id，不持久化到数据库
    private Set<Long> resourceIds = new HashSet<>();


    public Set<Roleadmin> getRoles() {
        return roles;
    }

    public void setRoles(Set<Roleadmin> roles) {
        this.roles = roles;
    }

    public Set<String> getUrls() {
        init(urls);
        forEachResource(resource -> urls.addAll(resource.getUrls()));
        return urls;
    }

    public void setUrls(Set<String> urls) {
        this.urls = urls;
    }

    public Set<Long> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(Set<Long> resourceIds) {
        this.resourceIds = resourceIds;
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

    public String getImoocPassword() {
        return imoocPassword;
    }

    public void setImoocPassword(String imoocPassword) {
        this.imoocPassword = imoocPassword == null ? null : imoocPassword.trim();
    }

    public String getImoocUsername() {
        return imoocUsername;
    }

    public void setImoocUsername(String imoocUsername) {
        this.imoocUsername = imoocUsername == null ? null : imoocUsername.trim();
    }

    /*----------------------------------------------------*/

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    public Set<Long> getAllResourceIds() {
        init(resourceIds);
        forEachResource(resource -> resourceIds.add(resource.getImoocId()));
        return resourceIds;
    }

    @Override
    public String getPassword() {
        return imoocPassword;
    }

    @Override
    public String getUsername() {
        return imoocUsername;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
    /*-----------------------------------------*/

    /**
     * @param data
     * @param
     */
    private void init(Set<?> data) {
        if (CollectionUtils.isEmpty(data)) {
            if (data == null) {
                data = new HashSet<>();
            }
        }
    }

    /**
     * @param consumer
     */
    private void forEachResource(Consumer<Resource> consumer) {
        for (Roleadmin role : roles) {
            for (Roleresource resource : role.getRole().getResources()) {
                consumer.accept(resource.getResource());
            }
        }
    }

}