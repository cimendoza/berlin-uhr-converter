package com.ubs.opsit.interviews.exception;

public class TimeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8850699836496323418L;
	
	public TimeException() {
	}
	
	public TimeException(String message) {
		super(message);
	}
	
	public TimeException(Throwable cause) {
		super(cause);
	}
	
	public TimeException(String message, Throwable cause) {
		super(message, cause);
	}

}
