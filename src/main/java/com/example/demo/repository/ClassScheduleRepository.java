package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ClassSchedule;

@Repository
public interface ClassScheduleRepository extends JpaRepository<ClassSchedule, Long> {
	
	@Query("SELECT t FROM ClassSchedule t WHERE classschedule_id = ?1")
	ClassSchedule findByClassScheduleid(Integer ClassSchedule);
}