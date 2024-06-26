package com.example.demo.service;

import java.util.List;

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

	public List<Masterrole> getAllMasterroles() {
		return masterroleRepository.findAll();
	}

	public Masterrole findByMasterRoleId(Integer role_id) {
		return masterroleRepository.findbyId(role_id);
	}

}
