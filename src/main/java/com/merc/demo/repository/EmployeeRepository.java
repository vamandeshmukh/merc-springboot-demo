package com.merc.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.merc.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// code here as needed

}
