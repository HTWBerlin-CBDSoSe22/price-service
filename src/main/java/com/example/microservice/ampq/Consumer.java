package com.example.microservice.ampq;

import com.example.microservice.service.PriceService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Consumer {

    @Autowired
    PriceService priceService;

    @RabbitListener(queues = "calculate-price", returnExceptions = "true")
    public float handleRequest(List<Float> request) {
        System.out.println("Receiving: " + request.toString());
        return priceService.calculate(request);
    }

}