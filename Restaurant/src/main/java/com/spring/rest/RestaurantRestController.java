package com.spring.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.Restaurant;
import com.spring.service.RestaurantService;

@RequestMapping("/restaurant")
@RestController
public class RestaurantRestController {

	@Autowired
	private RestaurantService service;
	
	@PostMapping
	public ResponseEntity<String> createRestaurant(@RequestBody Restaurant restaurant) {
		service.createRestaurant(restaurant);
		return new ResponseEntity<String>("Restaurant Created Successfully...", HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<Restaurant> getRestaurants() {
		return service.getAllRestaurants();
	}
	
	@GetMapping("/{restId}")
	public Restaurant getRestaurant(@PathVariable Integer restId) {
		return service.getRestaurantById(restId);
	}
	
	@PutMapping("/{restId}")
	public String updateRestaurant(@PathVariable Integer restId, @RequestBody Restaurant restaurant) {
		service.updateRestaurant(restId, restaurant);
		return "Restaurant Details Updated Successfully...";
	}
	
	@DeleteMapping("/{restId}")
	public String deleteRestaurant(@PathVariable Integer restId) {
		service.deleteRestaurant(restId);
		return "Restaurant Deleted Successfully...";
	}
	
}
