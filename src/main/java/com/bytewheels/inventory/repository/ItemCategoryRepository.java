package com.bytewheels.inventory.repository;

import com.bytewheels.inventory.dao.ItemCategory;
import org.springframework.data.repository.CrudRepository;

public interface ItemCategoryRepository extends CrudRepository<ItemCategory, String> {
}
