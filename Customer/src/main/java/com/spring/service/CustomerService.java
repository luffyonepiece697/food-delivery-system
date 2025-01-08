package com.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.Customer;
import com.spring.exception.NoCustomerFoundException;
import com.spring.repo.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepo;
	
	public void createCustomer(Customer customer) {
		customerRepo.save(customer);
	}
	
	public List<Customer> getAllCustomers() {
		return customerRepo.findAll();
	}

	public Customer getCustomerById(Integer custId) {
		Optional<Customer> byId = customerRepo.findById(custId);
		if(byId.isEmpty()) {
			throw new NoCustomerFoundException("No Customer Found with ID: "+custId);
		}
		// TODO Auto-generated method stub
		return byId.get();
	}

	public void updateCustomer(Integer custId, Customer customer) {
		// TODO Auto-generated method stub
		customerRepo.save(customer);	
		}

	public void deleteCustomer(Integer custId) {
		// TODO Auto-generated method stub
		customerRepo.deleteById(custId);
	}
}
