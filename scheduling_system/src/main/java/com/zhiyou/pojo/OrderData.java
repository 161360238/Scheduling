package com.zhiyou.pojo;

import java.util.Date;

public class OrderData {
    private String poNumber;

    private String productNumber;

    private Integer quantity;

    private Date targetDelivery;

    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber == null ? null : poNumber.trim();
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber == null ? null : productNumber.trim();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Date getTargetDelivery() {
        return targetDelivery;
    }

    public void setTargetDelivery(Date targetDelivery) {
        this.targetDelivery = targetDelivery;
    }
}