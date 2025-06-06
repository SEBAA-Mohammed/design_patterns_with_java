package com.mohammedsebaa.furniture.contemporary;

import com.mohammedsebaa.furniture.Chair;

public class ContemporaryChair implements Chair {
    private static final double PRICE = 120.0;

    @Override
    public double getPrice() {
        return PRICE;
    }

    @Override
    public String getStyle() {
        return "Contemporary";
    }
}