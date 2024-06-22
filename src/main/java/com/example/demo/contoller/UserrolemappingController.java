package com.example.demo.contoller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Userrolemapping;
import com.example.demo.service.UserrolemappingService;

@RestController
@RequestMapping("/api/User")
public class UserrolemappingController {
	
	@Autowired
	private UserrolemappingService userrolemappingService;
	
	@PostMapping("/saveUserrolemapping")
	public ResponseEntity<Userrolemapping> saveUserrolemapping(@RequestBody Userrolemapping userrolemapping){
		Userrolemapping saveUserrolemapping = userrolemappingService.registerUserrolemappingUser(userrolemapping);
		return new ResponseEntity<>(saveUserrolemapping,HttpStatus.CREATED);
	}
	
}