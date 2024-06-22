package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="department")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer dept_id;
	private String dept_name;
	private String hod_name;
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(Integer dept_id) {
		this.dept_id = dept_id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public String getHod_name() {
		return hod_name;
	}
	public void setHod_name(String hod_name) {
		this.hod_name = hod_name;
	}
	public Department(Integer dept_id, String dept_name, String hod_name) {
		super();
		this.dept_id = dept_id;
		this.dept_name = dept_name;
		this.hod_name = hod_name;
	}
	public Department() {
		super();
	}
	@Override
	public String toString() {
		return "Department [dept_id=" + dept_id + ", dept_name=" + dept_name + ", hod_name=" + hod_name + "]";
	}
	
}
	
	
	
