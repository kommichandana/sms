package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "class")
public class Classess {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int class_id;
	private String class_name;
	private int dept_id;

	public int getClass_id() {
		return class_id;
	}

	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}

	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public Classess(int class_id, String class_name, int dept_id) {
		super();
		this.class_id = class_id;
		this.class_name = class_name;
		this.dept_id = dept_id;
	}

	@Override
	public String toString() {
		return "Class [class_id=" + class_id + ", class_name=" + class_name + ", dept_id=" + dept_id + "]";
	}

	public Classess() {
		super();
	}

}
