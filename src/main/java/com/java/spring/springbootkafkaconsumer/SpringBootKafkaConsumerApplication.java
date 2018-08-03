package com.java.spring.springbootkafkaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication(scanBasePackages = {"com.java.spring"})
public class SpringBootKafkaConsumerApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(SpringBootKafkaConsumerApplication.class, args);
	}
}
