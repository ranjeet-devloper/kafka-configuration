package com.kafka.exam.kafkaservice;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.kafka.exam.entity.User;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class JsonKafkaConsumer {

	@KafkaListener(topics = "javaguide_JSON", groupId = "myGroup")
	public void consumer(User user) {
		log.info(String.format("Json STring object is->%s", user.toString()));
	}

}
