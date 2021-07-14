package com.olx.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.olx.beans.Customer;

@Repository
public interface CustomerRepo extends CrudRepository<Customer, Integer> {

}
