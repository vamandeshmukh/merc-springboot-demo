package com.merc.demo.service;

import java.util.List;

import com.merc.demo.model.Employee;

public interface IEmployeeService {

	public abstract List<Employee> getAllEmployees();

	public abstract Employee getEmpById(Integer eid);

	public List<Employee> getEmpByFirstName(String firstName);

	public abstract Employee addEmployee(Employee emp);

	public abstract Employee updateEmployee(Employee emp);

	public abstract Employee deleteEmployee(Integer eid);
}
