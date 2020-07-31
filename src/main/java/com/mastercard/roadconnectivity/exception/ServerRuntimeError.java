/**
 * 
 */
package com.mastercard.roadconnectivity.exception;

/**
 * @author Govardhan Mudduluru
 *
 */
public class ServerRuntimeError extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3557194630592559885L;

	public ServerRuntimeError(String message, Throwable cause) {
        super(message, cause);
    }

}
