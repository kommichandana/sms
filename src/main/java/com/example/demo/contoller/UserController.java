package com.example.demo.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("/getAllUsers")
	public List<User> getAllUsers(){
		List<User> getAllUsers = UserService.getAllUsers();
		return getAllUsers;
	}
	
	 @GetMapping("/user/{user_id}")
	    public ResponseEntity<User> getUserById(@PathVariable Integer user_id) {
			User user = UserService.findByUserId(user_id);
	        if (user != null) {
	            return ResponseEntity.ok(user);
	        } else {
	            return ResponseEntity.noContent().build();
	        }
	    }

	 @PostMapping("/login")
	    public ResponseEntity<String> loginUser(@RequestParam String user_name, @RequestParam String password) {
	        try {
	            User user = UserService.loginUser(user_name, password);
	            return new ResponseEntity<>("Login successful!", HttpStatus.OK);
	        } catch (RuntimeException e) {
	            return new ResponseEntity<>(e.getMessage(), HttpStatus.UNAUTHORIZED);
	        }
	    }
}
