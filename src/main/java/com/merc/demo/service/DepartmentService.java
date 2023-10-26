package com.merc.demo.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.merc.demo.exception.DepartmentNotFoundException;
import com.merc.demo.model.Department;
import com.merc.demo.repository.DepartmentRepository;

@Service
public class DepartmentService implements IDepartmentService {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	@Autowired
	DepartmentRepository depRepository;

	@Override
	public Department getDepartmentById(Integer did) {
		LOG.info(did.toString());
		Optional<Department> depOpt = depRepository.findById(did);
		if (depOpt.isPresent())
			return depOpt.get();
		String errorMessage = "Department with did " + did + " not found.";
		LOG.warn(errorMessage);
		throw new DepartmentNotFoundException(errorMessage);
	}

	@Override
	public List<Department> getAllDepartments() {
		LOG.info("getAllDepartments");
		return depRepository.findAll();
	}

}
