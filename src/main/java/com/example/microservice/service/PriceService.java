package com.example.microservice.service;

import com.example.microservice.model.productPrice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceService {

    public float calculate(List<Float> request) { //todo soll eig nicht static sein aber receiver will so

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

    private static productPrice getPriceResponse(float amount) { //todo auch hier static
        productPrice priceResponse = new productPrice();
        priceResponse.setPrice(amount);
        return priceResponse;
    }

}
