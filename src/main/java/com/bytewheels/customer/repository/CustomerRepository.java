package com.bytewheels.customer.repository;

import com.bytewheels.customer.dao.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, String> {

}
