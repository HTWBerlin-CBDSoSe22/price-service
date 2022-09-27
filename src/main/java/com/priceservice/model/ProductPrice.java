package com.priceservice.model;

import com.priceservice.exception.FloatingPointOverflowException;

public class ProductPrice {

    float price;

    public ProductPrice(float price) throws FloatingPointOverflowException {
        this.price = price;
        if (isOutOfRange()) {
            throw new FloatingPointOverflowException();
        }
    }

    public float getPrice() {
        return price;
    }

    public boolean isOutOfRange() {
        return price < 0 || price >= Float.MAX_VALUE;
    }
}
