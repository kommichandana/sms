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

import com.example.demo.entity.Faculty;
import com.example.demo.service.FacultyService;

@RestController
@RequestMapping("/api/faculty")
public class FacultyController {

	@Autowired
	private FacultyService facultyService;

	@PostMapping("/saveFaculty")
	public ResponseEntity<Faculty> saveFaculty(@RequestBody Faculty faculty) {
		Faculty saveFaculty = facultyService.registerFaculty(faculty);
		return new ResponseEntity<>(saveFaculty, HttpStatus.CREATED);
	}
	@GetMapping("/getALLFaculty")
	public List<Faculty> getAllFaculty(){
		List<Faculty> getAllFaculty = facultyService.getAllFaculty();
		return getAllFaculty;
	}
	
	 @GetMapping("/facultyid/{faculty_id}")
	    public ResponseEntity<Faculty> getFacultyById(@PathVariable Integer faculty_id) {
	        Faculty faculty = facultyService.findByFacultyId(faculty_id);
	        if (faculty != null) {
	            return ResponseEntity.ok(faculty);
	        } else {
	            return ResponseEntity.noContent().build();
	        }
	    }
}
