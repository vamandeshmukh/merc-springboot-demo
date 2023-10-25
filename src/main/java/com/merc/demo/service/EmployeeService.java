package com.merc.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.merc.demo.model.Employee;

@Service
public class EmployeeService {

	List<Employee> empList = new ArrayList<>();

	public List<Employee> getAllEmployees() {
		System.out.println("getAllEmployees");
		return empList;
	}

	public Employee getEmpById(Integer eid) {
		System.out.println(eid);
		return null;
	}

}
