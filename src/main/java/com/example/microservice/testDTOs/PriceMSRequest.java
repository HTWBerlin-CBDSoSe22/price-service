package com.example.microservice.testDTOs;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PriceMSRequest {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendJSON(PriceList priceList) {
        rabbitTemplate.convertAndSend(priceList);
    }

}
