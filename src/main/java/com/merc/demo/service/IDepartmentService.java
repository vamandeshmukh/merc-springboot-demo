package com.merc.demo.service;

import java.util.List;

import com.merc.demo.model.Department;

public interface IDepartmentService {

	public abstract Department getDepartmentById(Integer did);

	public abstract List<Department> getAllDepartments();
}
