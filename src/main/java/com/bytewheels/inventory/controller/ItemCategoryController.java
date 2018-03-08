package com.bytewheels.inventory.controller;

import com.bytewheels.inventory.dao.ItemCategory;
import com.bytewheels.inventory.service.ItemCategoryService;
import com.bytewheels.inventory.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemCategoryController {

    @Autowired
    private ItemCategoryService itemCategoryService;

    @RequestMapping(value = "/category/getAll",method = RequestMethod.GET)
    public List<ItemCategory> getAllCategories(){
        return itemCategoryService.getAllCategories();
    }

}
