package com.example.MPloin.Exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.MPloin.MPloinApplication;

@RestControllerAdvice
public class MyExceptionHandler {
	
	private static final Logger logger = LoggerFactory.getLogger(MPloinApplication.class);

	@ExceptionHandler(RuntimeException.class)
    public final ResponseEntity<Exception> handleAllExceptions(RuntimeException e) {
        logger.error("Internal server error.", e);
        return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
    }
	
}
