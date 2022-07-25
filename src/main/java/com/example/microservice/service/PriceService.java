package com.example.microservice.service;

import com.example.microservice.model.ComponentPrices;
import com.example.microservice.model.ProductPrice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceService {

    public float calculate(ComponentPrices request) {


        /*
        // convert json to floats
        String requestString = request.toString();
        String pricesComponentsString[] = requestString.split(",");
        Float[] pricesComponents = new Float[pricesComponentsString.length];

        for (int i=0; i<pricesComponentsString.length; i++) {
            pricesComponentsString[i] = String.valueOf((Float) pricesComponents[i]);
        }
        //add component prices to get product price
        float amount = 0;
        for (int j=0; j<pricesComponents.length; j++) {
           amount += pricesComponents[j];
        }

         */
        /*
        float amount = 0;
        List<Float> priceList = request.getPriceList();
        for (int j = 0; j < priceList.size(); j++) {
            amount += priceList.get(j);
        }

         */
        return 0f;
    }

    private ProductPrice getPriceResponse(float amount) {
        return new ProductPrice(amount);
    }

}
