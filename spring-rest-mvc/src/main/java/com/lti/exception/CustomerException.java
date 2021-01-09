package com.lti.exception;

public class CustomerException extends RuntimeException{

	public CustomerException(String string) {
			super(string);

}

	public CustomerException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public CustomerException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public CustomerException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
}
