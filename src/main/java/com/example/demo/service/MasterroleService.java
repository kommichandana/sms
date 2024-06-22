package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Masterrole;
import com.example.demo.repository.MasterroleRepository;

@Service
public class MasterroleService {
	
@Autowired
private MasterroleRepository masterroleRepository;

 public Masterrole registerMasterrole(Masterrole masterrole) {
	 return masterroleRepository.save(masterrole);
 }
}
