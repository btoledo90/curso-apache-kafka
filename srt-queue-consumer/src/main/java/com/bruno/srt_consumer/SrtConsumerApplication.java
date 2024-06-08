package com.bruno.srt_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class SrtConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SrtConsumerApplication.class, args);
	}

}
