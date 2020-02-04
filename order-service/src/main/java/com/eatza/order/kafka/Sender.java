/**
 * 
 */
package com.eatza.order.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

import com.eatza.order.model.Order;

/**
 * @author Salim
 *
 */
public class Sender {

	@Autowired
	private KafkaTemplate<String, Order> kafkaTemplate;

	public void send(String topic, Order payload) {
		kafkaTemplate.send(topic, payload);
	}

}
