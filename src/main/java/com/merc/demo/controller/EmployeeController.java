package com.merc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.merc.demo.model.Employee;
import com.merc.demo.service.EmployeeService;

@RestController
@RequestMapping("api")
//@CrossOrigin(origins = "3000")
//@CrossOrigin(origins = { "3000", "4200" })
@CrossOrigin(origins = "*")
public class EmployeeController {

	@Autowired
	EmployeeService empService;

//	http://localhost:8090/api/get-all-emps

	@GetMapping("get-all-emps")
	public List<Employee> getAllEmps() {
		return empService.getAllEmployees();
	}

	@GetMapping("get-emp-by-id/{empid}")
	public Employee getEmpById(@PathVariable(name = "empid") Integer eid) {
		return empService.getEmpById(eid);
	}
	
	

}

//package com.merc.demo.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.merc.demo.model.Employee;
//import com.merc.demo.service.EmployeeService;
//
//@RestController
//public class EmployeeController {
//
////	EmployeeService empService = new EmployeeService(); // not needed 
//
//	@Autowired
//	EmployeeService empService;
//
//	@GetMapping("get-all-emps")
//	public List<Employee> getAllEmps() {
//		return empService.getAllEmployees();
//	}
//
//	@GetMapping("get-emp-by-id")
//	public Employee getEmpById() {
//		int eid = 101;
//		return empService.getEmpById(eid);
//	}
//
//}
