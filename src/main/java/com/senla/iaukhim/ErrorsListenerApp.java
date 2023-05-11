package com.senla.iaukhim;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class ErrorsListenerApp {

    @Value("${spring.kafka.template.default-topic}")
    private String defaultTopic;

    public static void main(String[] args) {
        SpringApplication.run(ErrorsListenerApp.class, args);
    }
    @KafkaListener(topics = "${spring.kafka.template.default-topic}")
    public void handleMessage(RentAppError rentAppError){
        System.out.println(rentAppError);
    }

}
