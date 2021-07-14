package com.olx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.olx.beans.Users;
import com.olx.service.UserService;


//added swagger and actuator in pom.xml
//enables all endpoint of actuator from application.properties file

@RestController
@RequestMapping("/users")
public class UsersController {

	@Autowired
	UserService userService;

	@GetMapping
	public List<Users> getUsers() {

		return userService.getAllUsers();

	}

	@PostMapping
	public void addUsers(@RequestBody Users users) {

		userService.addUsers(users);

	}

	@GetMapping("/userId")
	public Users getByID(@RequestParam int userId) {
		
		return userService.getUserById(userId);


	}
	
	// user defined method in repository
	@GetMapping("/userName")
	public Users getByUserName(@RequestParam String userName) {
		
		return userService.getUserByUserName(userName);


	}

}
