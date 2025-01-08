package com.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.spring.entity.Order;
import com.spring.exception.NoOrderFoundException;
import com.spring.repo.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepo;

	public void createOrder(Order order) {
		// TODO Auto-generated method stub
		orderRepo.save(order);
	}

	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return orderRepo.findAll();
	}

	public Order getOrderById(Integer orderId) {
		Optional<Order> byId = orderRepo.findById(orderId);
		if(byId.isEmpty()) {
			throw new NoOrderFoundException("No Order Found with Id: "+orderId);
		}
		return byId.get();
	}
	
	
}
