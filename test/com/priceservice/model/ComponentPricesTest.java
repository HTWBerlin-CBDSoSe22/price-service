package com.priceservice.model;

import com.priceservice.exception.ComponentPriceNotFoundException;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ComponentPricesTest {

    List<Float> priceList = new LinkedList<>();

    @Test
    void containsInvalidComponentPriceNegative() {
        ComponentPrices testPrices = new ComponentPrices(priceList);
        priceList.add(-1f);

        assertThrows(ComponentPriceNotFoundException.class, ()
                -> {
             testPrices.getPriceList();
        });
    }

    @Test
    void containsInvalidComponentPriceZero() {
        ComponentPrices testPrices = new ComponentPrices(priceList);
        priceList.add(4f);
        priceList.add(0f);

        assertThrows(ComponentPriceNotFoundException.class, ()
                -> {
            testPrices.getPriceList();
        });
    }
}