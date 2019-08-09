package com.zhiyou.pojo;

public class Limitations {
    private String productNumber;

    private String productName;

    private Integer operationOrder;

    private String equipmentNumber;

    private Integer capacity;

    private Integer minPrdQuant;

    private String workForceReq;

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber == null ? null : productNumber.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Integer getOperationOrder() {
        return operationOrder;
    }

    public void setOperationOrder(Integer operationOrder) {
        this.operationOrder = operationOrder;
    }

    public String getEquipmentNumber() {
        return equipmentNumber;
    }

    public void setEquipmentNumber(String equipmentNumber) {
        this.equipmentNumber = equipmentNumber == null ? null : equipmentNumber.trim();
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getMinPrdQuant() {
        return minPrdQuant;
    }

    public void setMinPrdQuant(Integer minPrdQuant) {
        this.minPrdQuant = minPrdQuant;
    }

    public String getWorkForceReq() {
        return workForceReq;
    }

    public void setWorkForceReq(String workForceReq) {
        this.workForceReq = workForceReq == null ? null : workForceReq.trim();
    }
}