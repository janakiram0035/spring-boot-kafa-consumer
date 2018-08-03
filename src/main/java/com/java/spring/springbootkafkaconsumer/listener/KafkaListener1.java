package com.java.spring.springbootkafkaconsumer.listener;

import com.java.spring.springbootkafkaconsumer.bean.User;
import org.springframework.stereotype.Service;
import  org.springframework.kafka.annotation.KafkaListener;

@Service
public class KafkaListener1 {

    @KafkaListener(topics = "test", group = "group_id")
    public void consumeMessage(String messages) {

        System.out.println(messages);

    }

    @KafkaListener(topics = "test1", group = "user-group", containerFactory = "userKafkaListenerContainerFactory")
    public void consumeMessage1(User messages) {

        System.out.println(messages);

    }
}
