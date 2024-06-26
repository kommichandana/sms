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
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Masterrole;
import com.example.demo.service.MasterroleService;

@RestController
@RequestMapping("/api/masterrole")
public class MasterroleController {

	@Autowired
	private MasterroleService masterroleService;

	@PostMapping("/saveMasterrole")
	public ResponseEntity<Masterrole> saveMasterrole(@RequestBody Masterrole masterrole) {
		Masterrole saveMasterrole = masterroleService.registerMasterrole(masterrole);
		return new ResponseEntity<>(saveMasterrole, HttpStatus.CREATED);

	}
	@GetMapping("/getAllStudents")
	public List<Masterrole> getAllMasterroles() {
		List<Masterrole> getAllMasterroles = masterroleService.getAllMasterroles();
		return getAllMasterroles;

	}

	@GetMapping("/id/{dept_Id}")
	public ResponseEntity<Masterrole> getMasterRoleById(@PathVariable Integer role_id) {
		Masterrole masterrole = masterroleService.findByMasterRoleId(role_id);
		if (masterrole != null) {
			return ResponseEntity.ok(masterrole);
		} else {
			return ResponseEntity.noContent().build();
		}

	}


}
