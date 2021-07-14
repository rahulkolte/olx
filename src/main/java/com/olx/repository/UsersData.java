package com.olx.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.olx.beans.Users;

@Repository
public interface UsersData extends CrudRepository<Users, Integer>{

	@Query(value = "SELECT * FROM USERS u WHERE u.user_name = ?1", 
			  nativeQuery = true)
	public Users getUserByUserName(String userName);
}
