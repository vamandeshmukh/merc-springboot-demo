package com.merc.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.merc.demo.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// code here as needed

	// note -
	// no need to create any methods for common CRUD operations -
	// SELECT - findAll()
	// SELECT - finById()
	// insert - save()
	// update - save()
	// delete - deleteById()

	// methods for other business operations need to be created

	// guide -
//	https://docs.spring.io/spring-data/jpa/docs/current/reference/html/

//	syntax 
//	public abstract List<Object> findByExistingFieldName(Object FieldName);

	public abstract List<Employee> findByFirstName(String firstName);

	public abstract List<Employee> findByFirstNameIgnoreCase(String firstName);

	public abstract List<Employee> findBySalary(Double salary);

	public abstract List<Employee> findBySalaryLessThan(Double salary);

	public abstract List<Employee> findBySalaryGreaterThan(Double salary);

	public abstract List<Employee> findBySalaryBetween(Double salary1, Double salary2);

}



