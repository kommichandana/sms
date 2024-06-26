package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	@Query("SELECT t FROM User t WHERE t.user_id= ?1")
	User findByUserId(Integer user_id);
	
		@Query ("SELECT u FROM User u WHERE u.user_name = ?1")
		 User findByUsername(String user_name);
	

}
