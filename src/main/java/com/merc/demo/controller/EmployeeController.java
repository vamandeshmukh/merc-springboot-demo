package com.merc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.merc.demo.model.Employee;
import com.merc.demo.service.EmployeeService;

@RestController
public class EmployeeController {

//	EmployeeService empService = new EmployeeService(); // not needed 

	@Autowired
	EmployeeService empService;

	@GetMapping("get-all-emps")
	public List<Employee> getAllEmps() {
		System.out.println("getAllEmps");
		return empService.getAllEmployees();
	}
	
//	get-emp-by-id // 101 

}
