package com.demo.convert.numbers.exception;

public class NumberRuntimeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NumberRuntimeException() {
		super();
	}
	public NumberRuntimeException(String message) {
		super(message);
	}	
	
	public NumberRuntimeException(String message, Throwable cause) {
			super(message, cause);
	}
	

}
