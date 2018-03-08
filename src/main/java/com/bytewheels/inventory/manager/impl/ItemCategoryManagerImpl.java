package com.bytewheels.inventory.manager.impl;

import com.bytewheels.inventory.dao.ItemCategory;
import com.bytewheels.inventory.manager.ItemCategoryManager;
import com.bytewheels.inventory.repository.ItemCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ItemCategoryManagerImpl implements ItemCategoryManager {

    @Autowired
    private ItemCategoryRepository itemCategoryRepository;

    @Override
    public List<ItemCategory> getAllCategories(){
        return itemCategoryRepository.findAll();
    }
}
