package com.zhiyou.pojo;

import java.util.Date;

public class PostProductionSequence {
    private String jobNumber;

    private Date targetDelivery;

    private String poNumber;

    private Date prdStartDate;

    private Date estFinishDate;

    private String productNumber;

    private Integer reqQuant;

    private Integer prdQuant;

    private Date cycleTime;

    private String processName;

    private String equipmentNumber;

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber == null ? null : jobNumber.trim();
    }

    public Date getTargetDelivery() {
        return targetDelivery;
    }

    public void setTargetDelivery(Date targetDelivery) {
        this.targetDelivery = targetDelivery;
    }

    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber == null ? null : poNumber.trim();
    }

    public Date getPrdStartDate() {
        return prdStartDate;
    }

    public void setPrdStartDate(Date prdStartDate) {
        this.prdStartDate = prdStartDate;
    }

    public Date getEstFinishDate() {
        return estFinishDate;
    }

    public void setEstFinishDate(Date estFinishDate) {
        this.estFinishDate = estFinishDate;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber == null ? null : productNumber.trim();
    }

    public Integer getReqQuant() {
        return reqQuant;
    }

    public void setReqQuant(Integer reqQuant) {
        this.reqQuant = reqQuant;
    }

    public Integer getPrdQuant() {
        return prdQuant;
    }

    public void setPrdQuant(Integer prdQuant) {
        this.prdQuant = prdQuant;
    }

    public Date getCycleTime() {
        return cycleTime;
    }

    public void setCycleTime(Date cycleTime) {
        this.cycleTime = cycleTime;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName == null ? null : processName.trim();
    }

    public String getEquipmentNumber() {
        return equipmentNumber;
    }

    public void setEquipmentNumber(String equipmentNumber) {
        this.equipmentNumber = equipmentNumber == null ? null : equipmentNumber.trim();
    }
}