package com.priceservice.service;

import com.priceservice.model.ComponentPrices;
import com.priceservice.model.ProductPrice;
import com.priceservice.exception.ComponentPricesNotFoundException;
import com.priceservice.exception.FloatingPointOverflowException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceService {

    public ProductPrice calculateProductPrice(ComponentPrices request) throws ComponentPricesNotFoundException, FloatingPointOverflowException {
        float amount = 0;

        List<Float> priceList = request.getPriceList();

        for (Float componentPrice : priceList) {
            if (componentPrice <= 0) {
                throw new ComponentPricesNotFoundException();
            }
            amount += componentPrice;
        }
        if (amount >= Float.MAX_VALUE) {
            throw new FloatingPointOverflowException();
        }

        return new ProductPrice(amount);
    }
}
