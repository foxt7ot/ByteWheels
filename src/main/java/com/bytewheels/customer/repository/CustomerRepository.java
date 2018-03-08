package com.bytewheels.customer.repository;

import com.bytewheels.customer.dao.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, String> {

}
