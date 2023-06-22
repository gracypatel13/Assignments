package com.queryexample.exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler extends RuntimeException {
	
	public String  ResourceNotFoundExceptionHandler(ResourceNotFoundException ex) {
		String message = ex.getMessage();
		return message;
	}

}
