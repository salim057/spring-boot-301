package com.eatza.restaurantsearch.dto;

import java.util.List;

import com.eatza.restaurantsearch.model.Restaurant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantResponseDto {

	List<Restaurant> restaurants;
	int totalPages;
	long totalElements;

}
