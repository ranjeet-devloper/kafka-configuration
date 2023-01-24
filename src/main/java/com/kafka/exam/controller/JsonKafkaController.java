package com.kafka.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.exam.entity.User;
import com.kafka.exam.kafkaservice.JsonKafkaProducer;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonKafkaController {

	@Autowired
	private JsonKafkaProducer jsonKafkaProducer;

	@PostMapping("/jsonpublish")
	public ResponseEntity<String> jsonMessagePublish(@RequestBody User user) {
		jsonKafkaProducer.sendJeson(user);
		return ResponseEntity.ok("message send to the topic");
	}
}
