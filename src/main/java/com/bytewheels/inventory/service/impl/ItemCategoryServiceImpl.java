package com.bytewheels.inventory.service.impl;

import com.bytewheels.inventory.dao.ItemCategory;
import com.bytewheels.inventory.manager.ItemCategoryManager;
import com.bytewheels.inventory.service.ItemCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemCategoryServiceImpl implements ItemCategoryService {

    @Autowired
    private ItemCategoryManager itemCategoryManager;

    @Override
    public List<ItemCategory> getAllCategories(){
        return itemCategoryManager.getAllCategories();
    }
}
