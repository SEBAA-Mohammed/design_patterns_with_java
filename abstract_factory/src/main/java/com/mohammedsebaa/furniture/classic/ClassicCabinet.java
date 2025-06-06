package com.mohammedsebaa.furniture.classic;

import com.mohammedsebaa.furniture.Cabinet;

public class ClassicCabinet implements Cabinet {
    private static final double PRICE = 300.0;

    @Override
    public double getPrice() {
        return PRICE;
    }

    @Override
    public String getStyle() {
        return "Classic";
    }
}