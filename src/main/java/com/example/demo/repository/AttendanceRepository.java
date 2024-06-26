package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Attendance;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Integer> {

	@Query("SELECT t FROM Attendance t WHERE t.attendance_id= ?1")
	Attendance findbyId(Integer attendance_Id);

}
