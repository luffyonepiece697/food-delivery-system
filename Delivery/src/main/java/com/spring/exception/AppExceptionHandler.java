package com.spring.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler(value = NoDeliveryFoundException.class)
	public ResponseEntity<String> handleNDE(NoDeliveryFoundException e) {
	
		return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
	}

}
