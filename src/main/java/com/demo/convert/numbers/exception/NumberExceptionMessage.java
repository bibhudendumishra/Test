package com.demo.convert.numbers.exception;

public class NumberExceptionMessage extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NumberExceptionMessage() {
		super();
	}
	public NumberExceptionMessage(String message) {
		super(message);
	}	
	
	public NumberExceptionMessage(String message, Throwable cause) {
			super(message, cause);
	}
	
}
