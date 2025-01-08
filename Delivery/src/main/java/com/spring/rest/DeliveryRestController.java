package com.spring.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.clients.CustomerFeignClient;
import com.spring.entity.Customer;
import com.spring.entity.Delivery;
import com.spring.service.DeliveryService;

@RestController
@RequestMapping("/delivery")
public class DeliveryRestController {
	
	@Autowired
	private DeliveryService service;
	
	@Autowired
	private CustomerFeignClient customerFeign;
	
	@GetMapping("/customer/{deliveryId}")
	public Customer getCustomerByDeliveryId(@PathVariable Integer deliveryId) {
		Optional<Delivery> deliveryById = service.getDeliveryById(deliveryId);
		Delivery delivery = deliveryById.get();
		Integer custId = delivery.getCustomerId();
		return customerFeign.getCustomerById(custId);
	}
	
	@PostMapping
	public ResponseEntity<String> addDelivery(@RequestBody Delivery delivery) {
		service.createDelivery(delivery);
		return new ResponseEntity<>("Delivery Created...", HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<Delivery> getAllDeliveries() {
		return service.getAllDeliveries();
	}
	
	@GetMapping("/{deliveryId}")
	public Optional<Delivery> getDeliveryById(@PathVariable Integer deliveryId) {
		return service.getDeliveryById(deliveryId);
	}
	
	@PutMapping("/{deliveryId}")
	public String updateDeliveryStatus(@PathVariable Integer deliveryId, @RequestBody String deliveryStatus) {
		service.updateDeliveryStatus(deliveryId, deliveryStatus);
		return "Delivery Status Updated...";
	}
}
