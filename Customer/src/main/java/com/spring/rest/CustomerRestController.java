package com.spring.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.Customer;
import com.spring.service.CustomerService;


@RequestMapping("/customer")
@RestController
public class CustomerRestController {
	
	@Autowired
	private CustomerService service;
	
	@PostMapping
	public ResponseEntity<String> createCustomer(@RequestBody Customer customer) {
		service.createCustomer(customer);
		return new ResponseEntity<String>("Customer Created Successfully...",HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<Customer> getAllCustomers() {
		return service.getAllCustomers();
	}
	
	@GetMapping("/{custId}")
	public Customer getCustomer(@PathVariable Integer custId) {
		return service.getCustomerById(custId);
	}
	
	@PutMapping("/{custId}")
	public String updateCustomerById(@PathVariable Integer custId, @RequestBody Customer customer) {
		service.updateCustomer(custId, customer);
		return "Customer Details Updated Successfully...";
	}
	
	@DeleteMapping("/{custId}")
	public String deleteCustomer(@PathVariable Integer custId) {
		service.deleteCustomer(custId);
		return "Customer Deleted Successfully...";
	}
}
