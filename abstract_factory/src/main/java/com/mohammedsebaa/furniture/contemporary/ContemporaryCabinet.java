package com.mohammedsebaa.furniture.contemporary;

import com.mohammedsebaa.furniture.Cabinet;

public class ContemporaryCabinet implements Cabinet {
    private static final double PRICE = 350.0;

    @Override
    public double getPrice() {
        return PRICE;
    }

    @Override
    public String getStyle() {
        return "Contemporary";
    }
}