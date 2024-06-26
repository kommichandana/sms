package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ClassSchedule;
import com.example.demo.repository.ClassScheduleRepository;

@Service

public class ClassScheduleService {
	@Autowired
	private ClassScheduleRepository classscheduleRepository;

	public ClassSchedule registerClassSchedule(ClassSchedule classschedule) {
		return classscheduleRepository.save(classschedule);
	}

	public List<ClassSchedule> getAllClassSchedule() {
		return classscheduleRepository.findAll();
	}

	public ClassSchedule findByClassScheduleid(Integer ClassScheduleid) {
		return classscheduleRepository.findByClassScheduleid(ClassScheduleid);
	}
}
