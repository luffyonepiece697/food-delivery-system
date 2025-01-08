package com.spring.exception;

public class NoDeliveryFoundException extends RuntimeException{
	
	public NoDeliveryFoundException(String msg) {
		super(msg);
	}
}
