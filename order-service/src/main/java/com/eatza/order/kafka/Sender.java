/**
 * 
 */
package com.eatza.order.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.eatza.order.model.Order;

import lombok.extern.log4j.Log4j2;

/**
 * @author Salim
 *
 */
@Log4j2
@Service
public class Sender {

	@Autowired
	private KafkaTemplate<String, Order> kafkaTemplate;

	public void send(String topic, Order payload) {
		log.info("sending payload='{}' to topic='{}'", payload, topic);
		this.kafkaTemplate.send(topic, payload);
	}

}
