package com.example.demo.entity;

import java.sql.Time;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ClassSchedue")
public class ClassSchedule {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer classschedule_id;
	private Integer class_id;
	private Integer faculty_id;
	private Integer day_of_week;
	private  Time start_time;
	private  Time end_time;
	private String class_location;
	public Integer getClassschedule_id() {
		return classschedule_id;
	}
	public void setClassschedule_id(Integer classschedule_id) {
		this.classschedule_id = classschedule_id;
	}
	public Integer getClass_id() {
		return class_id;
	}
	public void setClass_id(Integer class_id) {
		this.class_id = class_id;
	}
	public Integer getFaculty_id() {
		return faculty_id;
	}
	public void setFaculty_id(Integer faculty_id) {
		this.faculty_id = faculty_id;
	}
	public Integer getDay_of_week() {
		return day_of_week;
	}
	public void setDay_of_week(Integer day_of_week) {
		this.day_of_week = day_of_week;
	}
	public Time getStart_time() {
		return start_time;
	}
	public void setStart_time(Time start_time) {
		this.start_time = start_time;
	}
	public Time getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Time end_time) {
		this.end_time = end_time;
	}
	public String getClass_location() {
		return class_location;
	}
	public void setClass_location(String class_location) {
		this.class_location = class_location;
	}
	public ClassSchedule(Integer classschedule_id, Integer class_id, Integer faculty_id, Integer day_of_week,
			Time start_time, Time end_time, String class_location) {
		super();
		this.classschedule_id = classschedule_id;
		this.class_id = class_id;
		this.faculty_id = faculty_id;
		this.day_of_week = day_of_week;
		this.start_time = start_time;
		this.end_time = end_time;
		this.class_location = class_location;
	}
	@Override
	public String toString() {
		return "ClassSchedule [classschedule_id=" + classschedule_id + ", class_id=" + class_id + ", faculty_id="
				+ faculty_id + ", day_of_week=" + day_of_week + ", start_time=" + start_time + ", end_time=" + end_time
				+ ", class_location=" + class_location + "]";
	}
	public ClassSchedule() {
		super();
	}

	
}