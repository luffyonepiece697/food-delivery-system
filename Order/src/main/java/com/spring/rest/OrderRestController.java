package com.spring.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.entity.Order;
import com.spring.service.OrderService;

@RequestMapping("/order")
@RestController
public class OrderRestController {

	@Autowired
	private OrderService orderService;
	

	@PostMapping
	public ResponseEntity<String> createOrder(@RequestBody Order order) {
		orderService.createOrder(order);
		return new ResponseEntity<>("Order Created Successfully...", HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<Order> getOrders() {
		return orderService.getAllOrders();
	}
	
	@GetMapping("/{orderId}")
	public Order getOrderById(@PathVariable Integer orderId)  {
		return orderService.getOrderById(orderId);
	}
	
	
}
