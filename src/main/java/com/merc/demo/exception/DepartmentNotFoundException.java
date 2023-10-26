package com.merc.demo.exception;

public class DepartmentNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 7429434430023549835L;

	public DepartmentNotFoundException() {
		super();
	}

	public DepartmentNotFoundException(String errorMessage) {
		super(errorMessage);
	}
}
