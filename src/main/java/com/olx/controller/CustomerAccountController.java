package com.olx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olx.beans.Customer;
import com.olx.repository.CustomerRepo;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/customers")
public class CustomerAccountController {

	@Autowired
	CustomerRepo customerRepo;

	@PostMapping
	public void addCustomers(@RequestBody Customer customer) {
		customerRepo.save(customer);

	}

	@GetMapping
	public Iterable<Customer> getCustomers() {
		return customerRepo.findAll();

	}

}
