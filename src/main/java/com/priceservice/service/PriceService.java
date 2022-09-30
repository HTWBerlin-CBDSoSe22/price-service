package com.priceservice.service;

import com.priceservice.model.ComponentPrices;
import com.priceservice.model.ProductPrice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceService {

    public ProductPrice calculateProductPrice(ComponentPrices componentPrices) {
        List<Float> componentPricesList = componentPrices.getPriceList();
        float calculatedProductPrice = 0;

        for (float componentPrice : componentPricesList) {
            calculatedProductPrice += componentPrice;
        }

        return new ProductPrice(calculatedProductPrice);
    }

}
