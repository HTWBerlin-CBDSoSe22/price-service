package com.priceservice.ampq;

import com.priceservice.exception.ComponentPricesNotFoundException;
import com.priceservice.exception.FloatingPointOverflowException;
import com.priceservice.model.ComponentPrices;
import com.priceservice.model.ProductPrice;
import com.priceservice.service.PriceService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @Autowired
    PriceService priceService;

    @RabbitListener(queues = "#{queue.name}", returnExceptions = "true")
    public ProductPrice handleRequest(ComponentPrices request) throws ComponentPricesNotFoundException, FloatingPointOverflowException {
        System.out.println("Receiving: " + request.toString());
        return priceService.calculateProductPrice(request);
    }
}