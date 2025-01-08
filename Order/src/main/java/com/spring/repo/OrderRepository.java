package com.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
