package com.eatza.order.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderUpdateDto {

	private Long customerId;
	private Long restaurantId;
	private List<OrderedItemsDto> items;
	private Long orderId;

}
