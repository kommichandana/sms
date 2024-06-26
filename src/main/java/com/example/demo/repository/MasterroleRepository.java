package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Masterrole;

@Repository
public interface MasterroleRepository extends JpaRepository<Masterrole, Integer>{

	
	@Query("SELECT t FROM Masterrole t WHERE t.role_id = ?1")
	Masterrole findbyId(Integer role_id);
	

}
