package com.olx.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.olx.beans.Account;

@Repository
public interface AccountRepo extends CrudRepository<Account, Integer>{

}
