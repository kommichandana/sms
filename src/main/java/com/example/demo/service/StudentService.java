package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public Student registerStudent(Student student) {
		return studentRepository.save(student);
	}
	
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}

	public Student findByStdRollno(String stdRollno) {
        return studentRepository.findByStdRollno(stdRollno);
    }
}