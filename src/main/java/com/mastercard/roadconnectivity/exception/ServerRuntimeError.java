/**
 * 
 */
package com.mastercard.roadconnectivity.exception;

/**
 * @author Govardhan Mudduluru
 *
 */
public class ServerRuntimeError extends RuntimeException {
	
	public ServerRuntimeError(String message, Throwable cause) {
        super(message, cause);
    }

}
