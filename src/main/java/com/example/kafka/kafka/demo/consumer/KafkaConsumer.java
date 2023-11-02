package com.example.kafka.kafka.demo.consumer;

import org.springframework.kafka.annotation.KafkaListener;

public class KafkaConsumer {

    @KafkaListener(topics = "CustomerHistory", groupId = "foo")
    public void listenGroupFoo(String message) {
        System.out.println("Received Message in group foo: " + message);
    }

}
