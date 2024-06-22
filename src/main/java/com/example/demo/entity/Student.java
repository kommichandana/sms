package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long std_id;
	
	@Column(name = "std_rollno")
	private String stdRollno;

	private Long std_phone_no;
	private String std_address;
	private String std_name;
	private String std_email;
	private int department_dept_id;

	private int user_id;

	public Student(int department_dept_id, Long std_id, String std_rollno, Long std_phone_no, String std_address,
			String std_name, String std_email, int user_id) {
		super();
		this.department_dept_id = department_dept_id;
		this.std_id = std_id;
		this.stdRollno = std_rollno;
		this.std_phone_no = std_phone_no;
		this.std_address = std_address;
		this.std_name = std_name;
		this.std_email = std_email;
		this.user_id = user_id;
	}

	public String getStdRollno() {
		return stdRollno;
	}

	public void setStdRollno(String stdRollno) {
		this.stdRollno = stdRollno;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getDepartment_dept_id() {
		return department_dept_id;
	}

	public void setDepartment_dept_id(int department_dept_id) {
		this.department_dept_id = department_dept_id;
	}

	public Long getStd_id() {
		return std_id;
	}

	public void setStd_id(Long std_id) {
		this.std_id = std_id;
	}

	public Long getStd_phone_no() {
		return std_phone_no;
	}

	public void setStd_phone_no(Long std_phone_no) {
		this.std_phone_no = std_phone_no;
	}

	public String getStd_address() {
		return std_address;
	}

	public void setStd_address(String std_address) {
		this.std_address = std_address;
	}

	public String getStd_name() {
		return std_name;
	}

	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}

	public String getStd_email() {
		return std_email;
	}

	public void setStd_email(String std_email) {
		this.std_email = std_email;
	}

	public Student() {
		super();

	}

	@Override
	public String toString() {
		return "Student [department_dept_id=" + department_dept_id + ", std_id=" + std_id + ", std_rollno=" + stdRollno
				+ ", std_phone_no=" + std_phone_no + ", std_address=" + std_address + ", std_name=" + std_name
				+ ", std_email=" + std_email + ", user_id=" + user_id + "]";
	}

	public String getStd_rollno() {
		return stdRollno;
	}

	public void setStd_rollno(String std_rollno) {
		this.stdRollno = std_rollno;
	}

}
