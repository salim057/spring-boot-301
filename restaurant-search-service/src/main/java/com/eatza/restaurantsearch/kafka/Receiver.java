/**
 * 
 */
package com.eatza.restaurantsearch.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.eatza.restaurantsearch.model.Order;

import lombok.extern.log4j.Log4j2;

/**
 * @author Salim
 *
 */
@Log4j2
@Service
public class Receiver {

	@KafkaListener(topics = "${spring.kafka.topic.order-placed}", groupId = "${spring.kafka.consumer.group-id}")
	public void receive(Order order) {
		log.debug("NEW ORDER PLACED:: {}", order);
	}

}
