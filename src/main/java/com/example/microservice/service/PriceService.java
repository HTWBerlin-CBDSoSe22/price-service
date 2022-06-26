package com.example.microservice.service;

import com.example.microservice.testDTOs.PriceMSRequest;
import com.example.microservice.testDTOs.PriceMSResponse;
import org.springframework.stereotype.Service;

@Service
public class PriceService {

    public static PriceMSResponse calculate(PriceMSRequest request) {
        PriceMSResponse priceResponse = new PriceMSResponse();


        //iterate over list and add prices
        float amount = 0;
        priceResponse.setPrice(amount);

        return priceResponse;
    }

}
