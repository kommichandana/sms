package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "masterrole")
public class Masterrole {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer role_id;
	private String role_name;
	public Integer getRole_id() {
		return role_id;
	}
	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public Masterrole(Integer role_id, String role_name) {
		super();
		this.role_id = role_id;
		this.role_name = role_name;
	}
	public Masterrole() {
		super();
	}
	@Override
	public String toString() {
		return "Masterrole [role_id=" + role_id + ", role_name=" + role_name + "]";
	}
	
}

