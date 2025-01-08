package com.spring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {

	@Id
	private Integer customerId;
	private String customerName;
	private String customerEmail;
	private String customerPhoneNo;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(Integer customerId, String customerName, String customerEmail, String customerPhoneNo) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerPhoneNo = customerPhoneNo;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPhoneNo() {
		return customerPhoneNo;
	}

	public void setCustomerPhoneNo(String customerPhoneNo) {
		this.customerPhoneNo = customerPhoneNo;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerEmail="
				+ customerEmail + ", customerPhoneNo=" + customerPhoneNo + "]";
	}
	
	
}
