package com.example.microservice.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.example.microservice.model.ComponentPrices;
import com.example.microservice.model.ProductPrice;

import java.util.LinkedList;
import java.util.List;

class PriceServiceTest {

    List<Float> priceList = new LinkedList<>();
    ComponentPrices componentPrices = new ComponentPrices(priceList);
    ProductPrice productPrice = new ProductPrice(0f);
    private final PriceService priceService = new PriceService();

    @Test
    void calculateHappyTwoComponents(){
        priceList.add(5f);
        priceList.add(3f);
        productPrice.setPrice(8f);

        assertEquals(priceService.calculateProductPrice(componentPrices).getPrice(),productPrice.getPrice());
    }

    @Test
    void calculateHappyThreeComponents(){
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(3f);
        productPrice.setPrice(13f);

        assertEquals(priceService.calculateProductPrice(componentPrices).getPrice(),productPrice.getPrice());
    }

    @Test
    void calculateHappyJustOneComponent(){
        priceList.add(5f);
        productPrice.setPrice(5f);

        assertEquals(priceService.calculateProductPrice(componentPrices).getPrice(),productPrice.getPrice());
    }

    @Test
    void calculateHappyOddNumbersOne(){
        priceList.add(5.7f);
        priceList.add(4.3f);
        productPrice.setPrice(10f);

        assertEquals(priceService.calculateProductPrice(componentPrices).getPrice(),productPrice.getPrice());
    }

    @Test
    void calculateHappyOddNumbersTwo(){
        priceList.add(5.7f);
        priceList.add(4.4f);
        productPrice.setPrice(10.1f);

        assertEquals(priceService.calculateProductPrice(componentPrices).getPrice(),productPrice.getPrice());
    }

    @Test
    void calculateBadNegativeNumbers(){
        priceList.add(-5f);
        priceList.add(-3f);
        productPrice.setPrice(10f);

        assertThrows(IllegalArgumentException.class, ()
                -> {priceService.calculateProductPrice(componentPrices);} );
    }

    @Test
    void calculateBadZero(){
        priceList.add(5f);
        priceList.add(0f);
        productPrice.setPrice(10f);

        assertThrows(IllegalArgumentException.class, ()
                -> {priceService.calculateProductPrice(componentPrices);} );
    }

    @Test
    void calculateBadNoComponent(){
        productPrice.setPrice(0f);

        assertEquals(priceService.calculateProductPrice(componentPrices).getPrice(),productPrice.getPrice());
    }

}