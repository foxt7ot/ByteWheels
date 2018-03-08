package com.bytewheels.order.dao;

import com.bytewheels.common.dao.ModificationMetaData;
import com.bytewheels.customer.dao.Customer;
import com.bytewheels.inventory.dao.ItemInventory;

import java.util.Date;

public class Booking {

    private String id;

    private Customer customer;

    private ItemInventory itemInventory;

    private Date fromDate;

    private Date toDate;

    private ModificationMetaData modificationMetaData;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ItemInventory getItemInventory() {
        return itemInventory;
    }

    public void setItemInventory(ItemInventory itemInventory) {
        this.itemInventory = itemInventory;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public ModificationMetaData getModificationMetaData() {
        return modificationMetaData;
    }

    public void setModificationMetaData(ModificationMetaData modificationMetaData) {
        this.modificationMetaData = modificationMetaData;
    }
}
