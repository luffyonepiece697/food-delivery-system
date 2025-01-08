package com.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.Delivery;

public interface DeliveryRepository extends JpaRepository<Delivery, Integer> {

}
