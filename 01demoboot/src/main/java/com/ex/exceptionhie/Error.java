package com.ex.exceptionhie;

public class Error {
	private int code;
	private String cause;

	public Error(int code, String cause) {
		super();
		this.code = code;
		this.cause = cause;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

}
