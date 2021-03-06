package com.neethi.rest.webservice.MyRestWebservice.User;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice	// To Share across multiple Controllers
@RestController
public class CustomizedExceptionHandler extends 
			ResponseEntityExceptionHandler	{ 				// Extending Abstract class
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllException (Exception ex, WebRequest request)
	{
		ExceptionResponse expResponse = 
				new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity(expResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(UserNotFoundException.class)
	public final ResponseEntity<Object> handleUserNotFoundException (Exception ex, WebRequest request)
	{
		ExceptionResponse expResponse = 
				new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity(expResponse, HttpStatus.NOT_FOUND);
	}
}
