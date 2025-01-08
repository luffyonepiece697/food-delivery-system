package com.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.Delivery;
import com.spring.exception.NoDeliveryFoundException;
import com.spring.repo.DeliveryRepository;

@Service
public class DeliveryService {
	
	@Autowired
	private DeliveryRepository deliveryRepo;

	public void createDelivery(Delivery delivery) {
		// TODO Auto-generated method stub
		deliveryRepo.save(delivery);
	}

	public List<Delivery> getAllDeliveries() {
		// TODO Auto-generated method stub
		return deliveryRepo.findAll();
	}

	public Optional<Delivery> getDeliveryById(Integer deliveryId) {
		// TODO Auto-generated method stub
		return deliveryRepo.findById(deliveryId);
	}

	public void updateDeliveryStatus(Integer deliveryId, String deliveryStatus) {
		// TODO Auto-generated method stub
		Optional<Delivery> byId = deliveryRepo.findById(deliveryId);
		if(byId.isEmpty()) {
			throw new NoDeliveryFoundException("Delivery Not Found with the Id: "+deliveryId);
		}
		else {
			Delivery deli = byId.get();
			deli.setDeliveryStatus(deliveryStatus);
			deliveryRepo.save(deli);
		}
	}
	
	
}
