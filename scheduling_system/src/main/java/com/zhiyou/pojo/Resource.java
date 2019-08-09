package com.zhiyou.pojo;

import com.zhiyou.dto.ResourceInfo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class Resource {
    private Long imoocId;

    private Date imoocCreatedtime;

    private String imoocIcon;

    private String imoocLink;

    private String imoocName;

    private Integer imoocSort;

    private String imoocType;

    private Long imoocParentImoocId;

    //实际需要控制权限的urls
    private Set<String> urls;

    //父资源
    private Resource parent;

    //子资源
    private List<Resource> childs = new ArrayList<>();

    public ResourceInfo toTree(Admin admin) {
        ResourceInfo result = new ResourceInfo();
        BeanUtils.copyProperties(this, result);
        Set<Long> resourceIds = admin.getAllResourceIds();

        List<ResourceInfo> children = new ArrayList<ResourceInfo>();
        for (Resource child : getChilds()) {
            if (StringUtils.equals(admin.getUsername(), "admin") ||
                    resourceIds.contains(child.getImoocId())) {
                children.add(child.toTree(admin));
            }
        }
        result.setChildren(children);
        return result;
    }

    public Resource getParent() {
        return parent;
    }

    public void setParent(Resource parent) {
        this.parent = parent;
    }

    public List<Resource> getChilds() {
        return childs;
    }

    public void setChilds(List<Resource> childs) {
        this.childs = childs;
    }

    public Set<String> getUrls() {
        return urls;
    }

    public void setUrls(Set<String> urls) {
        this.urls = urls;
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

    public String getImoocIcon() {
        return imoocIcon;
    }

    public void setImoocIcon(String imoocIcon) {
        this.imoocIcon = imoocIcon == null ? null : imoocIcon.trim();
    }

    public String getImoocLink() {
        return imoocLink;
    }

    public void setImoocLink(String imoocLink) {
        this.imoocLink = imoocLink == null ? null : imoocLink.trim();
    }

    public String getImoocName() {
        return imoocName;
    }

    public void setImoocName(String imoocName) {
        this.imoocName = imoocName == null ? null : imoocName.trim();
    }

    public Integer getImoocSort() {
        return imoocSort;
    }

    public void setImoocSort(Integer imoocSort) {
        this.imoocSort = imoocSort;
    }

    public String getImoocType() {
        return imoocType;
    }

    public void setImoocType(String imoocType) {
        this.imoocType = imoocType == null ? null : imoocType.trim();
    }

    public Long getImoocParentImoocId() {
        return imoocParentImoocId;
    }

    public void setImoocParentImoocId(Long imoocParentImoocId) {
        this.imoocParentImoocId = imoocParentImoocId;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "imoocId=" + imoocId +
                ", imoocCreatedtime=" + imoocCreatedtime +
                ", imoocIcon='" + imoocIcon + '\'' +
                ", imoocLink='" + imoocLink + '\'' +
                ", imoocName='" + imoocName + '\'' +
                ", imoocSort=" + imoocSort +
                ", imoocType='" + imoocType + '\'' +
                ", imoocParentImoocId=" + imoocParentImoocId +
                ", urls=" + urls +
                ", parent=" + parent +
                ", childs=" + childs +
                '}';
    }
}