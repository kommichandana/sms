package com.example.demo.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Classess;
import com.example.demo.service.ClassService;

@RestController
@RequestMapping("/api/class")
public class ClassController {

	@Autowired
	private ClassService classService;

	@PostMapping("/saveClass")
	public Classess saveClass(@RequestBody Classess c) {
		Classess saveClass = classService.registerClass(c);
		return saveClass;
	}

	@GetMapping("/getAllClass")
	public List<Classess> getAllClasses() {
		List<Classess> getAllClass = classService.getAllClasses();
		return getAllClass;
	}

}

