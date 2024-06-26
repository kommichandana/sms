package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Faculty;

	@Repository
	public interface FacultyRepository extends JpaRepository<Faculty, Integer> {

		
		@Query("SELECT t FROM Faculty t WHERE t.faculty_id= ?1")
		Faculty findByFacultyId(Integer faculty_id);

	}

