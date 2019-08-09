package com.zhiyou.pojo;

public class InventoryData {
    private String inverntoryNumber;

    private String inventoryName;

    private String lotNumber;

    private String rawMaterialNumber;

    private String materialDescription;

    private String materialCategory;

    private Integer rawMaterialQuantity;

    public String getInverntoryNumber() {
        return inverntoryNumber;
    }

    public void setInverntoryNumber(String inverntoryNumber) {
        this.inverntoryNumber = inverntoryNumber == null ? null : inverntoryNumber.trim();
    }

    public String getInventoryName() {
        return inventoryName;
    }

    public void setInventoryName(String inventoryName) {
        this.inventoryName = inventoryName == null ? null : inventoryName.trim();
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber == null ? null : lotNumber.trim();
    }

    public String getRawMaterialNumber() {
        return rawMaterialNumber;
    }

    public void setRawMaterialNumber(String rawMaterialNumber) {
        this.rawMaterialNumber = rawMaterialNumber == null ? null : rawMaterialNumber.trim();
    }

    public String getMaterialDescription() {
        return materialDescription;
    }

    public void setMaterialDescription(String materialDescription) {
        this.materialDescription = materialDescription == null ? null : materialDescription.trim();
    }

    public String getMaterialCategory() {
        return materialCategory;
    }

    public void setMaterialCategory(String materialCategory) {
        this.materialCategory = materialCategory == null ? null : materialCategory.trim();
    }

    public Integer getRawMaterialQuantity() {
        return rawMaterialQuantity;
    }

    public void setRawMaterialQuantity(Integer rawMaterialQuantity) {
        this.rawMaterialQuantity = rawMaterialQuantity;
    }
}