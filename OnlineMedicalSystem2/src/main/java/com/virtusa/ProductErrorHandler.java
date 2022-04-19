package com.virtusa;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.virtusa.exception.ProductNotFoundException;
import com.virtusa.model.ErrorType;

@RestControllerAdvice
public class ProductErrorHandler {
	/**
	 * In case of ProductNotFoundException is thrown
	 * from any controller method, this logic gets
	 * executed which behaves like re-usable and
	 * clear code (Code Modularity)
	 * @param pne
	 * @return ResponseEntity
	 */
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<ErrorType> handleNotFound(ProductNotFoundException pne){
		
		return new ResponseEntity<ErrorType>(
				new ErrorType(
						new Date(System.currentTimeMillis()).toString(), 
						"404- NOT FOUND", 
						pne.getMessage()), 
				HttpStatus.NOT_FOUND);
	}

		
}

