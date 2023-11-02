package com.merc.demo.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.merc.demo.exception.EmployeeNotFoundException;
import com.merc.demo.model.Employee;
import com.merc.demo.repository.EmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	@Autowired
	EmployeeRepository empRepository;

	@Autowired
	IDepartmentService depService;

	@Override
	public List<Employee> getAllEmployees() {
		LOG.info("getAllEmployees");
		LOG.info("getAllEmployees");
		return empRepository.findAll();
	}

	@Override
	public Employee getEmpById(Integer eid) { // 101, 109
		LOG.info(eid.toString());
		Optional<Employee> empOpt = empRepository.findById(eid);
		if (empOpt.isPresent()) {
			return empOpt.get(); // 200
		} else {
			String errorMessage = "Employee with eid " + eid + " not found!";
			LOG.warn(errorMessage);
			throw new EmployeeNotFoundException(errorMessage); // 404
		}
	}

	@Override
	public List<Employee> getEmpByFirstName(String firstName) {
		LOG.info(firstName);
		return empRepository.findByFirstName(firstName);
	}

	@Override
	public Employee addEmployee(Employee emp) {
		depService.getDepartmentById(emp.getDepartment().getDid());
		LOG.info(emp.toString());
		return empRepository.save(emp);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		LOG.info(emp.toString());
		this.getEmpById(emp.getEid());
		return empRepository.save(emp);
	}

	@Override
	public Employee deleteEmployee(Integer eid) {
		LOG.info(eid.toString());
		Employee emp = this.getEmpById(eid);
		empRepository.deleteById(eid);
		return emp;
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
