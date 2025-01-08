package com.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
