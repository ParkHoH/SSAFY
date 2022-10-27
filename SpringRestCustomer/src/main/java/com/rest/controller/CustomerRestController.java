package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mvc.service.CustomerService;
import com.mvc.vo.Customer;

@RestController
public class CustomerRestController {
	CustomerService customerService;
	
	@Autowired
	public CustomerRestController(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@GetMapping("/customers")
	public List<Customer> selectAll() {
		return customerService.selectAll();
	}
	
}
