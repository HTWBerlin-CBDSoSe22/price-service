package com.example.microservice.service;

import com.example.microservice.model.ComponentPrices;
import com.example.microservice.model.ProductPrice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceService {

    public ProductPrice calculateProductPrice(ComponentPrices request) throws IllegalArgumentException, IllegalStateException {
        float amount = 0;

        List<Float> priceList = request.getPriceList();

        for (int j = 0; j < priceList.size(); j++) {
            if (priceList.get(j)<=0) {
                throw new IllegalArgumentException("es gibt momentan keine coupons");
            }
            amount += priceList.get(j);
        }
        if (amount >= Float.MAX_VALUE) {
            throw new IllegalStateException("Produkt konnte nicht erstellt werden");
        }
        return new ProductPrice(amount);
    }
}
