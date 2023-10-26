package com.merc.demo.exception;

public class EmployeeNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 7331601113731100761L;

	public EmployeeNotFoundException() {
		super();
	}

	public EmployeeNotFoundException(String errorMessage) {
		super(errorMessage);
	}

}
