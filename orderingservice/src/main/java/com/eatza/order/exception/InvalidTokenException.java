package com.eatza.order.exception;

import lombok.Getter;
import lombok.Setter;

public class InvalidTokenException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Getter @Setter
	private String errorCode;

	public InvalidTokenException() {
		super();
	}

	public InvalidTokenException(String msg) {
		super(msg);
	}

	public InvalidTokenException(String message, Throwable cause, String errorCode) {
		super(message, cause);
		this.errorCode = errorCode;
	}

}
