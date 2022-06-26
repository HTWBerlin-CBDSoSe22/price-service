package com.example.microservice.service;

import org.springframework.stereotype.Service;

@Service
public class PriceService {

    public PriceMSResponse calculate(PriceMSRequest request) {
        PriceMSResponse priceResponse = new PriceMSResponse();
        //iterate over list and add prices
        float amount = 0;
        priceResponse.setPrice(amount);

        return priceResponse;
    }

}
