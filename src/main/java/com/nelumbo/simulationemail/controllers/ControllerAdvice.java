package com.nelumbo.simulationemail.controllers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.nelumbo.simulationemail.entities.ErrorData;

@RestControllerAdvice
public class ControllerAdvice {

	
	
	
	@ExceptionHandler(value = MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorData> methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException ex) {
		ErrorData error = ErrorData.builder().message(ex.getFieldError().getDefaultMessage()).build();
		return new ResponseEntity<>(error,ex.getStatusCode());
	}
	/**
	@ExceptionHandler(value = DataIntegrityViolationException.class)
	public ResponseEntity<ErrorData> dataIntegrityViolationExceptionHandler(DataIntegrityViolationException ex) {
		ErrorData error = ErrorData.builder().message(ex.getRootCause().getLocalizedMessage()).build();
		return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value = UnexpectedTypeException.class)
	public ResponseEntity<ErrorData> unexpectedTypeExceptionHandler(UnexpectedTypeException ex) {
		ErrorData error = ErrorData.builder().message(ex.getMessage()).build();
		return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
	}**/
	
}
