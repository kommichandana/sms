package com.example.demo.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Attendance;
import com.example.demo.service.AttendanceService;

@RestController
@RequestMapping("/api/attendance")
public class AttendanceController {

	@Autowired
	private AttendanceService attendanceService;

	@PostMapping("/attendance")
	public ResponseEntity<Attendance> saveattendance(@RequestBody Attendance attendance) {
		Attendance saveAttendance = attendanceService.registerAttendance(attendance);
		return new ResponseEntity<>(saveAttendance, HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllStudents")
	public List<Attendance> getAllAttendance() {
		List<Attendance> getAllAttendance = attendanceService.getAllAttendance();
		return getAllAttendance;

	}

	@GetMapping("/Attendanceid/{attendance_id}")
	public ResponseEntity<Attendance> getAttendanceById(@PathVariable Integer attendance_id) {
		Attendance attendance = attendanceService.findByAttendanceId(attendance_id);
		if (attendance != null) {
			return ResponseEntity.ok(attendance);
		} else {
			return ResponseEntity.noContent().build();
		}

	}
}
