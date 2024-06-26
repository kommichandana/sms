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

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@PostMapping("/department")
	public ResponseEntity<Department> savedepartment(@RequestBody Department department) {
		Department saveDepartment = departmentService.registerDepartments(department);
		return new ResponseEntity<>(saveDepartment, HttpStatus.CREATED);
	}

	@GetMapping("/getAllStudents")
	public List<Department> getAllDepartments() {
		List<Department> getAllDepartments = departmentService.getAllDepartments();
		return getAllDepartments;

	}

	@GetMapping("/id/{dept_Id}")
	public ResponseEntity<Department> getDepartmentById(@PathVariable Integer dept_Id) {
		Department department = departmentService.findByDepartmentId(dept_Id);
		if (department != null) {
			return ResponseEntity.ok(department);
		} else {
			return ResponseEntity.noContent().build();
		}

	}
}
