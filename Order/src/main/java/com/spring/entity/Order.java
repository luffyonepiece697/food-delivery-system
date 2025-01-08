package com.spring.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_table")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderId;
	private Integer customerId;
	private Integer restaurantId;
	private Double orderPrice;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(Integer orderId, Integer customerId, Integer restaurantId, Double orderPrice) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.restaurantId = restaurantId;
		this.orderPrice = orderPrice;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}

	public Double getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(Double orderPrice) {
		this.orderPrice = orderPrice;
	}
}
