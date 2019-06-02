package com.ex.exceptionhie;

public class MicroServiceException extends RuntimeException {

	private static final long serialVersionUID = -828465991917101222L;

	public MicroServiceException() {
		super();
	}

	public MicroServiceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MicroServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public MicroServiceException(String message) {
		super(message);
	}

	public MicroServiceException(Throwable cause) {
		super(cause);
	}

}
