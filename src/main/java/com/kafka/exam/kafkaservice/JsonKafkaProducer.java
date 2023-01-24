package com.kafka.exam.kafkaservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.kafka.exam.entity.User;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class JsonKafkaProducer {

	@Autowired
	private KafkaTemplate<String, User> kafkaTemplate;

	public void sendJeson(User user) {
		log.info(String.format("user value is %s", user.toString()));
		Message<User> message = MessageBuilder.withPayload(user).setHeader(KafkaHeaders.TOPIC, "javaguide_JSON")
				.build();
		kafkaTemplate.send(message);
	}
}
