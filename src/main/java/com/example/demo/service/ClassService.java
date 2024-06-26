package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Classess;
import com.example.demo.repository.ClassRepository;

@Service
public class ClassService {

	@Autowired
	private ClassRepository classRepository;

	public Classess registerClass(Classess c) {
		return classRepository.save(c);
	}

	public List<Classess> getAllClasses() {
		return classRepository.findAll();
	}

	public Classess findByclass_id(Integer class_id) {
		return classRepository.findByclassid(class_id);
	}
}

