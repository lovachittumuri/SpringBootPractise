package com.lova.db.connections.connections.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lova.db.connections.connections.model.Customer;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {

	
}
