package com.example.demo.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/api/user")

public class UserController {

	@Autowired
	private UserService UserService;

	@PostMapping("/saveUser")
	public ResponseEntity<User> saveuser(@RequestBody User user) {
		User saveUser = UserService.registerUser(user);
		return new ResponseEntity<>(saveUser, HttpStatus.CREATED);
	}

}
