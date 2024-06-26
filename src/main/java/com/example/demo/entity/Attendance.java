package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="attendance")
public class Attendance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int attendance_id;
	private int std_id;
	private int class_id;
	private LocalDate class_date;
	public int getAttendance_id() {
		return attendance_id;
	}
	public void setAttendance_id(int attendance_id) {
		this.attendance_id = attendance_id;
	}
	public int getStd_id() {
		return std_id;
	}
	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}
	public int getClass_id() {
		return class_id;
	}
	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}
	public LocalDate getClass_date() {
		return class_date;
	}
	public void setClass_date(LocalDate class_date) {
		this.class_date = class_date;
	}
	public Attendance(int attendance_id, int std_id, int class_id, LocalDate class_date) {
		super();
		this.attendance_id = attendance_id;
		this.std_id = std_id;
		this.class_id = class_id;
		this.class_date = class_date;
	}
	public Attendance() {
		super();
	}
	@Override
	public String toString() {
		return "Attendance [attendance_id=" + attendance_id + ", std_id=" + std_id + ", class_id=" + class_id
				+ ", class_date=" + class_date + "]";
	}
	
}
