package com.priceservice.model;

import com.priceservice.exception.FloatingPointOverflowException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductPriceTest {

    float price;

    @Test
    void priceTooLarge() {
        price = Float.MAX_VALUE + 1;
        assertThrows(FloatingPointOverflowException.class, ()
                -> {
            ProductPrice priceTooLarge = new ProductPrice(price);
        });
    }

    @Test
    void priceTooSmall() {
        price = -1f;
        assertThrows(FloatingPointOverflowException.class, ()
                -> {
            ProductPrice priceTooSmall = new ProductPrice(price);
        });
    }

    @Test
    void priceOK() {
        price = 1f;
        ProductPrice priceOK = new ProductPrice(price);

        assertEquals(priceOK.getPrice(), price);
    }
}