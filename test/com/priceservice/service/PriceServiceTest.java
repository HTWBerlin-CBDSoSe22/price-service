package com.priceservice.service;

import com.priceservice.exception.ComponentPricesNotFoundException;
import com.priceservice.exception.FloatingPointOverflowException;
import com.priceservice.model.ProductPrice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.priceservice.model.ComponentPrices;

import java.util.LinkedList;
import java.util.List;

class PriceServiceTest {

    List<Float> priceList = new LinkedList<>();
    ComponentPrices componentPrices = new ComponentPrices(priceList);
    ProductPrice expectedProductPrice = new ProductPrice(0f);
    private final PriceService priceService = new PriceService();

    @Test
    void calculateHappyTwoComponents() {
        priceList.add(5f);
        priceList.add(3f);
        expectedProductPrice.setPrice(8f);

        assertEquals(priceService.calculateProductPrice(componentPrices).getPrice(), expectedProductPrice.getPrice());
    }

    @Test
    void calculateHappyThreeComponents() {
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(3f);
        expectedProductPrice.setPrice(13f);

        assertEquals(priceService.calculateProductPrice(componentPrices).getPrice(), expectedProductPrice.getPrice());
    }

    @Test
    void calculateHappyJustOneComponent() {
        priceList.add(5f);
        expectedProductPrice.setPrice(5f);

        assertEquals(priceService.calculateProductPrice(componentPrices).getPrice(), expectedProductPrice.getPrice());
    }

    @Test
    void calculateHappyOddNumbersOne() {
        priceList.add(5.7f);
        priceList.add(4.3f);
        expectedProductPrice.setPrice(10f);

        assertEquals(priceService.calculateProductPrice(componentPrices).getPrice(), expectedProductPrice.getPrice());
    }

    @Test
    void calculateHappyOddNumbersTwo() {
        priceList.add(5.7f);
        priceList.add(4.4f);
        expectedProductPrice.setPrice(10.1f);

        assertEquals(priceService.calculateProductPrice(componentPrices).getPrice(), expectedProductPrice.getPrice());
    }

    @Test
    void calculateBadNegativeNumbers() {
        priceList.add(-5f);
        priceList.add(-3f);

        assertThrows(ComponentPricesNotFoundException.class, ()
                -> {
            priceService.calculateProductPrice(componentPrices);
        });
    }

    @Test
    void calculateBadZero() {
        priceList.add(5f);
        priceList.add(0f);

        assertThrows(ComponentPricesNotFoundException.class, ()
                -> {
            priceService.calculateProductPrice(componentPrices);
        });
    }

    @Test
    void calculateBadNoComponent() {
        expectedProductPrice.setPrice(0f);

        assertEquals(priceService.calculateProductPrice(componentPrices).getPrice(), expectedProductPrice.getPrice());
    }

    @Test
    void calculateBadFloatExploit() {
        priceList.add(1f);
        priceList.add(Float.MAX_VALUE);
        expectedProductPrice.setPrice(0f);

        assertThrows(FloatingPointOverflowException.class, ()
                -> {
            priceService.calculateProductPrice(componentPrices);
        });
    }

    @Test
    void calculateHappyLotsOfComponents() throws ComponentPricesNotFoundException, FloatingPointOverflowException {
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

        expectedProductPrice.setPrice(600f);

        assertEquals(priceService.calculateProductPrice(componentPrices).getPrice(), expectedProductPrice.getPrice());
    }

}