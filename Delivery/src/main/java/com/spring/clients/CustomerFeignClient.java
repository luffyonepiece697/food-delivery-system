package com.spring.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.spring.entity.Customer;

@FeignClient(name = "CUSTOMER")
public interface CustomerFeignClient { 
	
	@GetMapping("/customer/{custId}")
	public Customer getCustomerById(@PathVariable Integer custId);
}
