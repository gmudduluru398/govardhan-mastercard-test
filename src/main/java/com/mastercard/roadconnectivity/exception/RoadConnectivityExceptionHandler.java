/**
 * 
 */
package com.mastercard.roadconnectivity.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author Govardhan Mudduluru
 *
 */

@ControllerAdvice
public class RoadConnectivityExceptionHandler extends ResponseEntityExceptionHandler{
	
	
	  @ExceptionHandler({ CityNotFoundException.class })
	    protected ResponseEntity<Object> handleCityNotFound(
	      Exception ex, WebRequest request) {
	        return handleExceptionInternal(ex, "no", 
	          new HttpHeaders(), HttpStatus.NOT_FOUND, request);
	    }
	  
	  @ExceptionHandler({ BadRequestException.class })
	    protected ResponseEntity<Object> handleBadRequest(
	      Exception ex, WebRequest request) {
	        return handleExceptionInternal(ex, "no", 
	          new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
	    }
	  
	  @ExceptionHandler({ ServerRuntimeError.class })
	    protected ResponseEntity<Object> handleServerError(
	      Exception ex, WebRequest request) {
	        return handleExceptionInternal(ex, "no", 
	          new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
	    }
	 
}
