package com.spring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Delivery {
	
	@Id
	private Integer deliveryId;
	private Integer orderId;
	private Integer restaurantId;
	private Integer customerId;
	private String deliveryStatus;
	private String deliveryAssigned;
	private String deliveryTime;
	
	public Delivery() {
		// TODO Auto-generated constructor stub
	}

	public Delivery(Integer deliveryId, Integer orderId, Integer restaurantId, Integer customerId,
			String deliveryStatus, String deliveryAssigned, String deliveryTime) {
		super();
		this.deliveryId = deliveryId;
		this.orderId = orderId;
		this.restaurantId = restaurantId;
		this.customerId = customerId;
		this.deliveryStatus = deliveryStatus;
		this.deliveryAssigned = deliveryAssigned;
		this.deliveryTime = deliveryTime;
	}

	public Integer getDeliveryId() {
		return deliveryId;
	}

	public void setDeliveryId(Integer deliveryId) {
		this.deliveryId = deliveryId;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public String getDeliveryAssigned() {
		return deliveryAssigned;
	}

	public void setDeliveryAssigned(String deliveryAssigned) {
		this.deliveryAssigned = deliveryAssigned;
	}

	public String getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	@Override
	public String toString() {
		return "Delivery [deliveryId=" + deliveryId + ", orderId=" + orderId + ", restaurantId=" + restaurantId
				+ ", customerId=" + customerId + ", deliveryStatus=" + deliveryStatus + ", deliveryAssigned="
				+ deliveryAssigned + ", deliveryTime=" + deliveryTime + "]";
	}
}
