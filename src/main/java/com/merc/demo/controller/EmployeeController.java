package com.merc.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

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

	@PostMapping("add-emp")
	public Employee addEmp(@RequestBody Employee emp) {
		LOG.info(emp.toString());
		return empService.addEmployee(emp);
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
