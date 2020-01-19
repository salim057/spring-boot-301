/**
 * 
 */
package com.eatza.order.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.eatza.order.dto.ItemFetchDto;
import com.eatza.order.exception.ItemNotFoundException;

/**
 * @author Salim
 *
 */
@FeignClient(name="restaurant-service" )
public interface RestaurantServiceProxy {
	
	@GetMapping("/items/id/{id}")
	public ResponseEntity<ItemFetchDto> getItemById(@PathVariable Long id) throws ItemNotFoundException;

}
