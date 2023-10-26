package com.merc.demo.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.merc.demo.model.Department;
import com.merc.demo.model.Employee;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<Employee> handleEmployeeNotFoundException(EmployeeNotFoundException e) {
		HttpStatus status = HttpStatus.NOT_FOUND;
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", e.getMessage());
		ResponseEntity<Employee> response = new ResponseEntity<Employee>(null, headers, status);
		return response;
	}

	@ExceptionHandler(DepartmentNotFoundException.class)
	public ResponseEntity<Department> handleDepartmentNotFoundException(DepartmentNotFoundException e) {
		HttpStatus status = HttpStatus.NOT_FOUND;
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", e.getMessage());
		ResponseEntity<Department> response = new ResponseEntity<Department>(null, headers, status);
		return response;
	}
	// create other methods to handle other exceptions

}
