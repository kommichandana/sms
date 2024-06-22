package com.example.demo.service;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.example.demo.entity.Faculty;
	import com.example.demo.repository.FacultyRepository;

	@Service
	public class FacultyService{
		
		@Autowired
		private FacultyRepository facultyRepository;
		
		public Faculty registerFaculty(Faculty faculty) {
			return facultyRepository.save(faculty);
		}
	}

