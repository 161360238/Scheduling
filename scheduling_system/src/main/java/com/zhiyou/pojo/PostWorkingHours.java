package com.zhiyou.pojo;

public class PostWorkingHours {
    private String productNumber;

    private String processName;

    private String equimentNumber;

    private Double processTimeAvg;

    private Double processTimeMax;

    private Double processTimeMin;

    private Double processTimeStd;

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

    public String getEquimentNumber() {
        return equimentNumber;
    }

    public void setEquimentNumber(String equimentNumber) {
        this.equimentNumber = equimentNumber == null ? null : equimentNumber.trim();
    }

    public Double getProcessTimeAvg() {
        return processTimeAvg;
    }

    public void setProcessTimeAvg(Double processTimeAvg) {
        this.processTimeAvg = processTimeAvg;
    }

    public Double getProcessTimeMax() {
        return processTimeMax;
    }

    public void setProcessTimeMax(Double processTimeMax) {
        this.processTimeMax = processTimeMax;
    }

    public Double getProcessTimeMin() {
        return processTimeMin;
    }

    public void setProcessTimeMin(Double processTimeMin) {
        this.processTimeMin = processTimeMin;
    }

    public Double getProcessTimeStd() {
        return processTimeStd;
    }

    public void setProcessTimeStd(Double processTimeStd) {
        this.processTimeStd = processTimeStd;
    }
}