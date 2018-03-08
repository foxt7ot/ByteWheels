package com.bytewheels.inventory.dao;

import com.bytewheels.common.dao.ModificationMetaData;

public class ItemInventory {

    private String id;

    private Item item;

    private String registrationNumber;

    private float price;

    private ModificationMetaData modificationMetaData;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public ModificationMetaData getModificationMetaData() {
        return modificationMetaData;
    }

    public void setModificationMetaData(ModificationMetaData modificationMetaData) {
        this.modificationMetaData = modificationMetaData;
    }
}
