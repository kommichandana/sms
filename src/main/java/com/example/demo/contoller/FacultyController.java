package com.example.demo.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Faculty;
import com.example.demo.service.FacultyService;

@RestController
@RequestMapping("/api/faculty")
public class FacultyController {

	@Autowired
	private FacultyService FacultyService;

	@PostMapping("/saveFaculty")
	public ResponseEntity<Faculty> saveFaculty(@RequestBody Faculty faculty) {
		Faculty saveFaculty = FacultyService.registerFaculty(faculty);
		return new ResponseEntity<>(saveFaculty, HttpStatus.CREATED);
	}

}
