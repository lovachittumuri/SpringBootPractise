package com.lova.db.connections.connections.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	Long id;
	private String name;
	private String email;

	// @Temporal(TemporalType.DATE)
	//@Column(name = "CREATED_DATE")
	//Date date;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	

	public Customer(Long id, String name, String email, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Customer() {

	}

}