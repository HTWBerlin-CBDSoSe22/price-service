package com.example.microservice.ampq;

import com.example.microservice.model.ComponentPrices;
import com.example.microservice.model.ProductPrice;
import com.example.microservice.service.PriceService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @Autowired
    PriceService priceService;

    @RabbitListener(queues = "calculate-price", returnExceptions = "true")
    public ProductPrice handleRequest(ComponentPrices request) {
        System.out.println("Receiving: " + request.toString());
        return priceService.calculate(request);
    }

}