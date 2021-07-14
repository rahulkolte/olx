package com.olx.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olx.Exceptions.UserNotFoundException;
import com.olx.beans.Users;
import com.olx.repository.UsersData;

@Service
public class UserService {

	@Autowired
	UsersData usersData;

	public void addUsers(Users users) {

		usersData.save(users);

	}

	public List<Users> getAllUsers() {
		return (List<Users>) usersData.findAll();

	}

	public Users getUserById(int userId) {
		// TODO Auto-generated method stub
		Optional<Users> userOptional = usersData.findById(userId);
		if (userOptional.isEmpty()) {
			throw new UserNotFoundException("User is Not Present");
		}
		return userOptional.get();
	}

	
	public Users getUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return usersData.getUserByUserName(userName);
	}
}
