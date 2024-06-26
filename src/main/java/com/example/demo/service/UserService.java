package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User registerUser(User user) {
		return userRepository.save(user);
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public User findByUserId(Integer user_id) {
		return userRepository.findByUserId(user_id);
	}

	public User loginUser(String user_name, String password) {

		User user = userRepository.findByUsername(user_name);
		if (user != null && user.getPassword().equals(password)) {
			return user;
		}
		throw new RuntimeException("Invalid credentials");

	}
}
