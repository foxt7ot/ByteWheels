package com.bytewheels.inventory.dao;

import com.bytewheels.common.dao.ModificationMetaData;

public class ItemCategory {

    private String id;

    private String name;

    private float price;

    private ModificationMetaData modificationMetaData;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
