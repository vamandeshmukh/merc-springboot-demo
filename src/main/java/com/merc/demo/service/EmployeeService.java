package com.merc.demo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.merc.demo.model.Employee;
import com.merc.demo.repository.EmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	@Autowired
	EmployeeRepository empRepository;

	@Override
	public List<Employee> getAllEmployees() {
		LOG.info("getAllEmployees");
		return empRepository.findAll();
	}

	@Override
	public Employee getEmpById(Integer eid) {
		LOG.info(eid.toString());
		return null;
	}

	@Override
	public Employee addEmployee(Employee emp) {
		LOG.info(emp.toString());
//		empRepository.
		return empRepository.save(emp);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		return null;
	}

	@Override
	public Employee deleteEmployee(Integer eid) {
		return null;
	}

}

//package com.merc.demo.service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Service;
//
//import com.merc.demo.model.Employee;
//
//@Service
//public class EmployeeService implements IEmployeeService {
//
//	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
//
//	ArrayList<Employee> empList = new ArrayList<>();
//
//	{
//		empList.add(new Employee(101, "Sonu", 90000d));
//		empList.add(new Employee(102, "Monu", 99000d));
//		empList.add(new Employee(103, "Tonu", 95000d));
//		empList.add(new Employee(104, "Gonu", 98000d));
//		empList.add(new Employee(105, "Ponu", 92000d));
//	}
//
//	@Override
//	public List<Employee> getAllEmployees() {
//		LOG.info("getAllEmployees");
//		LOG.warn("some warning");
//		LOG.error("some error");
//		return empList;
//	}
//
//	@Override
//	public Employee getEmpById(Integer eid) {
//		LOG.info(eid.toString());
//		for (Employee e : empList) {
//			if (e.getEid() == eid)
//				return e;
//		}
//		return null;
//	}
//
//	@Override
//	public Employee addEmployee(Employee emp) {
//		LOG.info(emp.toString());
//		if (empList.add(emp))
//			return emp;
//		return null;
//	}
//
//	@Override
//	public Employee updateEmployee(Employee emp) {
//		return null;
//	}
//
//	@Override
//	public Employee deleteEmployee(Integer eid) {
//		return null;
//	}
//
//}
