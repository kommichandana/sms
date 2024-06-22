package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Userrolemapping;
import com.example.demo.repository.UserrolemappingRepository;

@Service
public class UserrolemappingService {
	
	@Autowired 
	private UserrolemappingRepository userrolemappingRepository;
	public Userrolemapping registerUserrolemappingUser(Userrolemapping userrolemapping) {
		return userrolemappingRepository.save(userrolemapping);
	}

}