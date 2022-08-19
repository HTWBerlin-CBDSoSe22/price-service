package com.example.microservice.service;

import com.example.microservice.model.ComponentPrices;
import com.example.microservice.model.ProductPrice;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceService {

    public ProductPrice calculate(ComponentPrices request) {
        float amount = 0;

        List<Float> priceList = request.getPriceList();
        for (int j = 0; j < priceList.size(); j++) {
            amount += priceList.get(j);
        }
        return new ProductPrice(amount);
    }
}
