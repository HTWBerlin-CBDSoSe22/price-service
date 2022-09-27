package com.priceservice.service;

import com.priceservice.model.ComponentPrices;
import com.priceservice.model.ProductPrice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceService {

    public ProductPrice calculateProductPrice(ComponentPrices request) {

        List<Float> componentPrices = request.getPriceList();

        float calculatedPrice = 0;
        for (float componentPrice : componentPrices) {
            calculatedPrice += componentPrice;
        }

        return new ProductPrice(calculatedPrice);
    }


}