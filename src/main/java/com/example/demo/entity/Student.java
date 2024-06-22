package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	private int department_dept_id;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long std_id ;
	private String std_rollno;
	private Long std_phone_no;
	private String std_address;
	private String std_name;
	private String std_email;
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
	public Student(int department_dept_id, Long std_id, Long std_phone_no, String std_address, String std_name,
			String std_email) {
		super();
		this.department_dept_id = department_dept_id;
		this.std_id = std_id;
		this.std_phone_no = std_phone_no;
		this.std_address = std_address;
		this.std_name = std_name;
		this.std_email = std_email;
	}
	public Student() {
		super();
		
	}
	@Override
	public String toString() {
		return "Student [department_dept_id=" + department_dept_id + ", std_id=" + std_id + ", std_phone_no="
				+ std_phone_no + ", std_address=" + std_address + ", std_name=" + std_name + ", std_email=" + std_email
				+ "]";
	}
	public String getStd_rollno() {
		return std_rollno;
	}
	public void setStd_rollno(String std_rollno) {
		this.std_rollno = std_rollno;
	}
	
	

}
