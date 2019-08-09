package com.zhiyou.pojo;

import java.util.Date;

public class PostLaborDemand {
    private String processName;

    private String equipmentNumber;

    private Integer workForceReq;

    private Date date;

    private String shift;

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

    public Integer getWorkForceReq() {
        return workForceReq;
    }

    public void setWorkForceReq(Integer workForceReq) {
        this.workForceReq = workForceReq;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift == null ? null : shift.trim();
    }
}