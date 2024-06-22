package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "faculty")
public class Faculty{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int faculty_id;

	private String faculty_name;
	private String faculty_designation;
	private int dept_id;
	private int user_id;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getFaculty_id() {
		return faculty_id;
	}

	public void setFaculty_id(int faculty_id) {
		this.faculty_id = faculty_id;
	}

	public String getFaculty_name() {
		return faculty_name;
	}

	public void setFaculty_name(String faculty_name) {
		this.faculty_name = faculty_name;
	}

	public String getFaculty_designation() {
		return faculty_designation;
	}

	public void setFaculty_designation(String faculty_designation) {
		this.faculty_designation = faculty_designation;
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	

	@Override
	public String toString() {
		return "Faculty [faculty_id=" + faculty_id + ", faculty_name=" + faculty_name + ", faculty_designation="
				+ faculty_designation + ", dept_id=" + dept_id + ", user_id=" + user_id + "]";
	}

	public Faculty(int faculty_id, String faculty_name, String faculty_designation, int dept_id, int user_id) {
		super();
		this.faculty_id = faculty_id;
		this.faculty_name = faculty_name;
		this.faculty_designation = faculty_designation;
		this.dept_id = dept_id;
		this.user_id = user_id;
	}

	public Faculty() {
		super();
	}
}
