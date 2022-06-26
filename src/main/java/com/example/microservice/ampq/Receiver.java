package com.example.microservice.ampq;

import com.example.microservice.service.PriceService;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;

@RabbitListener(id = "price_listener", queues = "calculate-price", returnExceptions = "true")
public class Receiver {

    @Autowired
    PriceService priceService;

    @RabbitHandler
    public PriceMSResponse handleRequest(PriceMSRequest request) {
        log.info("Receiving: " + request.toString());
        return PriceService.calculate(request);
    }

}