package com.bytewheels.inventory.repository;

import com.bytewheels.inventory.dao.ItemInventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ItemInventoryRepository extends JpaRepository<ItemInventory, String> {
}
