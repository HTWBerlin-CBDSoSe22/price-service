package com.priceservice.service;

import com.priceservice.model.ProductPrice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.priceservice.model.ComponentPrices;

import java.util.LinkedList;
import java.util.List;

class PriceServiceTest {

    List<Float> priceList = new LinkedList<>();
    ComponentPrices componentPrices = new ComponentPrices(priceList);
    private final PriceService priceService = new PriceService();

    @Test
    void calculateHappyTwoComponents() {
        priceList.add(5f);
        priceList.add(3f);
        ProductPrice expectedProductPrice = new ProductPrice(8f);

        assertEquals(priceService.calculateProductPrice(componentPrices).getPrice(), expectedProductPrice.getPrice());
    }

    @Test
    void calculateHappyThreeComponents() {
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(3f);
        ProductPrice expectedProductPrice = new ProductPrice(13f);

        assertEquals(priceService.calculateProductPrice(componentPrices).getPrice(), expectedProductPrice.getPrice());
    }

    @Test
    void calculateHappyJustOneComponent() {
        priceList.add(5f);
        ProductPrice expectedProductPrice = new ProductPrice(5f);

        assertEquals(priceService.calculateProductPrice(componentPrices).getPrice(), expectedProductPrice.getPrice());
    }

    @Test
    void calculateHappyOddNumbersOne() {
        priceList.add(5.7f);
        priceList.add(4.3f);
        ProductPrice expectedProductPrice = new ProductPrice(10f);

        assertEquals(priceService.calculateProductPrice(componentPrices).getPrice(), expectedProductPrice.getPrice());
    }

    @Test
    void calculateHappyOddNumbersTwo() {
        priceList.add(5.7f);
        priceList.add(4.4f);
        ProductPrice expectedProductPrice = new ProductPrice(10.1f);

        assertEquals(priceService.calculateProductPrice(componentPrices).getPrice(), expectedProductPrice.getPrice());
    }


    @Test
    void calculateBadNoComponent() {
        ProductPrice expectedProductPrice = new ProductPrice(0f);

        assertEquals(priceService.calculateProductPrice(componentPrices).getPrice(), expectedProductPrice.getPrice());
    }

    @Test
    void calculateHappyLotsOfComponents() {
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(5f);

        ProductPrice expectedProductPrice = new ProductPrice(600f);

        assertEquals(priceService.calculateProductPrice(componentPrices).getPrice(), expectedProductPrice.getPrice());
    }

}