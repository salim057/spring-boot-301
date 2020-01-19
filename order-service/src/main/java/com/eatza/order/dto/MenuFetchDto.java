package com.eatza.order.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class MenuFetchDto {

	private Long id;
	private String activeFrom;
	private String activeTill;
	@JsonProperty("restaurant")
	private RestaurantFetchDto restaurant;

}
