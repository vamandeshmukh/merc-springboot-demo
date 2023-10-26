package com.merc.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "department_table")
public class Department {

	@Id
	@Column(name = "department_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer did;

	@Column(name = "department_name")
	String departmentName;

	@Column(name = "city")
	String city;

	public Department() {
		super();
	}

	public Department(Integer did, String departmentName, String city) {
		super();
		this.did = did;
		this.departmentName = departmentName;
		this.city = city;
	}

	public Integer getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Department [did=" + did + ", departmentName=" + departmentName + ", city=" + city + "]";
	}

}
