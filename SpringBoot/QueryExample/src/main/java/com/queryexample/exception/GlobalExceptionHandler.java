package com.queryexample.exception;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.queryexample.payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler extends RuntimeException {
	
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String,String> handleInvalidArgument(MethodArgumentNotValidException ex){
		Map<String,String> errMap=new HashMap<>();
		ex.getBindingResult().getFieldErrors().forEach(error -> {
			errMap.put(error.getField(), error.getDefaultMessage());
		} );
		return errMap;
	}
	
	
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	@ExceptionHandler(ResourceNotFoundException.class)
	public ApiResponse resourceNotFoundHandler(ResourceNotFoundException ex) {
		String message=ex.getMessage();
		LocalDate time=LocalDate.now();
		return new ApiResponse(message,time);
	}
}
