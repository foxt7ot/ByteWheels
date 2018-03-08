package com.bytewheels.inventory.dao;

import com.bytewheels.common.dao.ModificationMetaData;

import javax.persistence.*;

@Entity
@Table(name = "item_inventory")
public class ItemInventory {

    @Id
    @Column(name = "id")
    private String id;

    @ManyToOne
    @JoinColumn(name = "item_id",referencedColumnName = "id")
    private Item item;

    @Column(name = "registration_number",nullable = false)
    private String registrationNumber;

    @Column(name="price")
    private float price;

    @Embedded
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
