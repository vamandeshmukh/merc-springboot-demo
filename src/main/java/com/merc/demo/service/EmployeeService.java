package com.merc.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.merc.demo.model.Employee;

@Service
public class EmployeeService {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	ArrayList<Employee> empList = new ArrayList<>();

	{
		empList.add(new Employee(101, "Sonu", 90000d));
		empList.add(new Employee(102, "Monu", 99000d));
		empList.add(new Employee(103, "Tonu", 95000d));
		empList.add(new Employee(104, "Gonu", 98000d));
		empList.add(new Employee(105, "Ponu", 92000d));
	}

	public List<Employee> getAllEmployees() {
		LOG.info("getAllEmployees");
//		LOG.warn("some warning");
//		LOG.error("some error");
//		LOG.debug("debug log");
		return empList;
	}

	public Employee getEmpById(Integer eid) {
		LOG.info(eid.toString());
		for (Employee e : empList) {
			if (e.getEid() == eid)
				return e;
		}
		return null;
	}

}