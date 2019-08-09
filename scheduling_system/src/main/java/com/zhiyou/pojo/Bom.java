package com.zhiyou.pojo;

import java.util.Date;

public class Bom {
    private String productNumber;

    private String processName;

    private String rawMaterialNumber;

    private Integer rawMaterialQuanty;

    private Date lastUpdateTime;

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber == null ? null : productNumber.trim();
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName == null ? null : processName.trim();
    }

    public String getRawMaterialNumber() {
        return rawMaterialNumber;
    }

    public void setRawMaterialNumber(String rawMaterialNumber) {
        this.rawMaterialNumber = rawMaterialNumber == null ? null : rawMaterialNumber.trim();
    }

    public Integer getRawMaterialQuanty() {
        return rawMaterialQuanty;
    }

    public void setRawMaterialQuanty(Integer rawMaterialQuanty) {
        this.rawMaterialQuanty = rawMaterialQuanty;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}