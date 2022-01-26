package com.lova.db.connections.connections.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lova.db.connections.connections.model.Customer;
import com.lova.db.connections.connections.repository.ICustomerRepository;

@RestController
public class CustomerController {

	@Autowired
	ICustomerRepository customerRepository;

	@PostMapping("/")
	public Customer saveCustomer(@RequestBody Customer customer) {
		return customerRepository.saveAndFlush(customer);
	}
	
	@GetMapping("/getData")
	public List<Customer> getCustomerData() {
		return customerRepository.findAll();
	}

	@GetMapping("/{name}")
	public String sayGoodMorning(@PathVariable("name") String name) {
		return "Good Morning   " + name;
	}
	
	

}