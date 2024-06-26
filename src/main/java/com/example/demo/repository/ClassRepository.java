package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Classess;

@Repository
public interface ClassRepository extends JpaRepository<Classess,Integer>{

	@Query("SELECT t FROM Classess t WHERE t.class_id= ?1")
	Classess findByclassid(Integer class_id);
	

}

