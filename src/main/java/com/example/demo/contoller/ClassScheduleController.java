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

import com.example.demo.entity.ClassSchedule;
import com.example.demo.service.ClassScheduleService;

@RestController
@RequestMapping("/api/classschedule")
public class ClassScheduleController {
	@Autowired
	private ClassScheduleService ClassScheduleService;

	@PostMapping("/saveClassSchedule")
	public ResponseEntity<ClassSchedule> saveClassSchedule(@RequestBody ClassSchedule classschedule) {
		ClassSchedule saveClassSchedule = ClassScheduleService.registerClassSchedule(classschedule);
		return new ResponseEntity<>(saveClassSchedule, HttpStatus.CREATED);
	}

	@GetMapping("/getAllClassSchedule")
	public List<ClassSchedule> getAllClassSchedule() {
		List<ClassSchedule> getAllClassSchedule = ClassScheduleService.getAllClassSchedule();
		return getAllClassSchedule;
	}

	@GetMapping("/ClassSchedule/{ClassScheduleid}")
	public ResponseEntity<ClassSchedule> getClassScheduleByClassScheduleid(@PathVariable Integer ClassScheduleid) {
		ClassSchedule ClassSchedule = ClassScheduleService.findByClassScheduleid(ClassScheduleid);
		if (ClassSchedule != null) {
			return ResponseEntity.ok(ClassSchedule);
		} else {
			return ResponseEntity.noContent().build();
		}
	}
}