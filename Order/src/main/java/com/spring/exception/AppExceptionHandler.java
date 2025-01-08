package com.spring.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler(value = NoOrderFoundException.class)
	public ResponseEntity<String> handleException(NoOrderFoundException e) {
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
	}
}
