package com.kafka.exam.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

	@Bean
	public NewTopic javaguidesTopic() {
		return TopicBuilder.name("javaguide").build();
	}
	
	@Bean
	public NewTopic jsonJavaguidesTopic() {
		return TopicBuilder.name("javaguide_JSON").build();
	}

}
