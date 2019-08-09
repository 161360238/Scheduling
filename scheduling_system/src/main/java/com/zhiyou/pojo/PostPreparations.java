package com.zhiyou.pojo;

public class PostPreparations {
    private String productNumber;

    private String rawMaterialNumber;

    private Integer reqRmQuantity;

    private Integer rawMaterialQuantity;

    private Integer remainInventory;

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber == null ? null : productNumber.trim();
    }

    public String getRawMaterialNumber() {
        return rawMaterialNumber;
    }

    public void setRawMaterialNumber(String rawMaterialNumber) {
        this.rawMaterialNumber = rawMaterialNumber == null ? null : rawMaterialNumber.trim();
    }

    public Integer getReqRmQuantity() {
        return reqRmQuantity;
    }

    public void setReqRmQuantity(Integer reqRmQuantity) {
        this.reqRmQuantity = reqRmQuantity;
    }

    public Integer getRawMaterialQuantity() {
        return rawMaterialQuantity;
    }

    public void setRawMaterialQuantity(Integer rawMaterialQuantity) {
        this.rawMaterialQuantity = rawMaterialQuantity;
    }

    public Integer getRemainInventory() {
        return remainInventory;
    }

    public void setRemainInventory(Integer remainInventory) {
        this.remainInventory = remainInventory;
    }
}