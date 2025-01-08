package com.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.Restaurant;
import com.spring.exception.NoRestaurantFoundException;
import com.spring.repo.RestaurantRepository;

@Service
public class RestaurantService {

	@Autowired
	private RestaurantRepository restaurantRepo;

	public void createRestaurant(Restaurant restaurant) {
		// TODO Auto-generated method stub
		restaurantRepo.save(restaurant);
	}

	public List<Restaurant> getAllRestaurants() {
		// TODO Auto-generated method stub
		return restaurantRepo.findAll();
	}

	public Restaurant getRestaurantById(Integer restId) {
		// TODO Auto-generated method stub
		Optional<Restaurant> byId = restaurantRepo.findById(restId);
		if(byId.isEmpty()) {
			throw new NoRestaurantFoundException("No Restaurant Found with ID: "+restId);
		}
		return byId.get();
	}

	public void updateRestaurant(Integer restId, Restaurant restaurant) {
		// TODO Auto-generated method stub
		
		restaurantRepo.save(restaurant);
	}

	public void deleteRestaurant(Integer restId) {
		// TODO Auto-generated method stub
		restaurantRepo.deleteById(restId);
	}
	
}
