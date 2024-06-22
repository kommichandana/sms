package com.example.demo.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

}
