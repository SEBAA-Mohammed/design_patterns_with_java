package com.mohammedsebaa.furniture.scandinavian;

import com.mohammedsebaa.furniture.Cabinet;

public class ScandinavianCabinet implements Cabinet {
    private static final double PRICE = 400.0;

    @Override
    public double getPrice() {
        return PRICE;
    }

    @Override
    public String getStyle() {
        return "Scandinavian";
    }
}