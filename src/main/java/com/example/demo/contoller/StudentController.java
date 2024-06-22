package com.example.demo.contoller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/saveStudent")
	public Student saveStudent(@RequestBody Student s) {
		Student saveStudent = studentService.registerStudent(s);
		return saveStudent;
	}
	
	@GetMapping("/getAllStudents")
	public List<Student> getAllStudent(){
		List<Student> getAllStudent = studentService.getAllStudents();
		return getAllStudent;
	}
	
	 @GetMapping("/rollno/{stdRollno}")
	    public ResponseEntity<Student> getStudentByRollno(@PathVariable String stdRollno) {
	        Student student = studentService.findByStdRollno(stdRollno);
	        if (student != null) {
	            return ResponseEntity.ok(student);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

}
