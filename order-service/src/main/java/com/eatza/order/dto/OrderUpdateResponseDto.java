package com.eatza.order.dto;

import java.util.List;

import com.eatza.order.model.OrderedItem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderUpdateResponseDto {

	private Long orderId;
	private Long customerId;
	private String status;
	private Long restaurantId;
	private List<OrderedItem> orderedItems;

}
