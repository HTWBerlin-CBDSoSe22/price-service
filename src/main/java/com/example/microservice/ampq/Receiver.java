package com.example.microservice.ampq;

import com.example.microservice.service.PriceService;
import com.example.microservice.testDTOs.PriceMSRequest;
import com.example.microservice.testDTOs.PriceMSResponse;
import groovy.util.logging.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;


@Slf4j
@RabbitListener(id = "price_listener", queues = "calculate-price", returnExceptions = "true")
public class Receiver {

    private final Logger log = (Logger) LoggerFactory.getLogger(Receiver.class);

    @Autowired
    PriceService priceService;

    @RabbitHandler
    public PriceMSResponse handleRequest(PriceMSRequest request) {
        log.info("Receiving: " + request.toString());
        return PriceService.calculate(request);
    }

}