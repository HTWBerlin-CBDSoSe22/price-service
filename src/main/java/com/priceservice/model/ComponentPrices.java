package com.priceservice.model;

import com.priceservice.exception.ComponentPriceNotFoundException;

import java.util.List;

public class ComponentPrices {

    private List<Float> priceList;

    public ComponentPrices(List<Float> priceList) throws ComponentPriceNotFoundException {
        this.priceList = priceList;
        if (containsInvalidComponentPrice()) {
            throw new ComponentPriceNotFoundException();
        }
    }

    public List<Float> getPriceList() throws ComponentPriceNotFoundException {
        if (containsInvalidComponentPrice()) {
            throw new ComponentPriceNotFoundException();
        }
        return priceList;
    }

    public boolean containsInvalidComponentPrice() {
        for (float componentPrice : priceList) {
            if (componentPrice <= 0) {
                return true;
            }
        }
        return false;
    }

}
