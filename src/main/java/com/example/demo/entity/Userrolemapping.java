package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Userrolemapping")
public class Userrolemapping {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mapping_id;
	private int role_id;
	private int user_id;
	public int getMapping_id() {
		return mapping_id;
	}
	public void setMapping_id(int mapping_id) {
		this.mapping_id = mapping_id;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public Userrolemapping(int mapping_id, int role_id, int user_id) {
		super();
		this.mapping_id = mapping_id;
		this.role_id = role_id;
		this.user_id = user_id;
	}
	public Userrolemapping() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Userrolemapping [mapping_id=" + mapping_id + ", role_id=" + role_id + ", user_id=" + user_id + "]";
	}



}
