package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Attendance;
import com.example.demo.repository.AttendanceRepository;

@Service
public class AttendanceService {

	@Autowired
	private AttendanceRepository attendanceRepository;

	public Attendance registerAttendance(Attendance attendance) {
		return attendanceRepository.save(attendance);
	}

	public List<Attendance> getAllAttendance() {
		return attendanceRepository.findAll();
	}

	public Attendance findByAttendanceId(Integer attendance_id) {
		return attendanceRepository.findbyId(attendance_id);
	}
	
}