package com.example.microservice.testDTOs;

import java.util.ArrayList;
import java.util.List;

public class PriceList {

    List<Float> priceList;

    public PriceList() {
        this.priceList = new ArrayList<Float>();
        priceList.add(10.7f);
        priceList.add(8.0f);
        priceList.add(1.5f);
        priceList.add(1.3f);
        priceList.add(1.9f);
    }

}
