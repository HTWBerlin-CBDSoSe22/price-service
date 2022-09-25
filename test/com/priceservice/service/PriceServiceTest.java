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
    ProductPrice productPrice = new ProductPrice(0f);
    private final PriceService priceService = new PriceService();

    @Test
    void calculateHappyTwoComponents() throws ComponentPricesNotFoundException, FloatingPointOverflowException {
        priceList.add(5f);
        priceList.add(3f);
        productPrice.setPrice(8f);

        assertEquals(priceService.calculateProductPrice(componentPrices).getPrice(),productPrice.getPrice());
    }

    @Test
    void calculateHappyThreeComponents() throws ComponentPricesNotFoundException, FloatingPointOverflowException {
        priceList.add(5f);
        priceList.add(5f);
        priceList.add(3f);
        productPrice.setPrice(13f);

        assertEquals(priceService.calculateProductPrice(componentPrices).getPrice(),productPrice.getPrice());
    }

    @Test
    void calculateHappyJustOneComponent() throws ComponentPricesNotFoundException, FloatingPointOverflowException {
        priceList.add(5f);
        productPrice.setPrice(5f);

        assertEquals(priceService.calculateProductPrice(componentPrices).getPrice(),productPrice.getPrice());
    }

    @Test
    void calculateHappyOddNumbersOne() throws ComponentPricesNotFoundException, FloatingPointOverflowException {
        priceList.add(5.7f);
        priceList.add(4.3f);
        productPrice.setPrice(10f);

        assertEquals(priceService.calculateProductPrice(componentPrices).getPrice(),productPrice.getPrice());
    }

    @Test
    void calculateHappyOddNumbersTwo() throws ComponentPricesNotFoundException, FloatingPointOverflowException {
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

        assertThrows(ComponentPricesNotFoundException.class, ()
                -> {priceService.calculateProductPrice(componentPrices);} );
    }

    @Test
    void calculateBadZero(){
        priceList.add(5f);
        priceList.add(0f);
        productPrice.setPrice(10f);

        assertThrows(ComponentPricesNotFoundException.class, ()
                -> {priceService.calculateProductPrice(componentPrices);} );
    }

    @Test
    void calculateBadNoComponent() throws ComponentPricesNotFoundException, FloatingPointOverflowException {
        productPrice.setPrice(0f);

        assertEquals(priceService.calculateProductPrice(componentPrices).getPrice(),productPrice.getPrice());
    }

    @Test
    void calculateBadFloatExploit(){
        priceList.add(1f);
        priceList.add(Float.MAX_VALUE);
        productPrice.setPrice(0f);

        assertThrows(FloatingPointOverflowException.class, ()
                -> {priceService.calculateProductPrice(componentPrices);} );
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

        productPrice.setPrice(600f);

        assertEquals(priceService.calculateProductPrice(componentPrices).getPrice(),productPrice.getPrice());
    }

}