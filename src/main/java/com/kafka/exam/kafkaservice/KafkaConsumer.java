package com.kafka.exam.kafkaservice;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class KafkaConsumer {

	@KafkaListener(topics="javaguides",groupId = "myGroup")
	public void consumeMessage(String message)
	{
		log.info(message);
	}
	
}
