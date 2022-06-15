package com.example.microservice.service.rabbit;

import org.springframework.stereotype.Component;

//POJO that defines a method for receiving messages
@Component
public class Receiver {

    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
    }
}
