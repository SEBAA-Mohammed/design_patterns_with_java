package com.mohammedsebaa.furniture.classic;

import com.mohammedsebaa.furniture.Chair;

public class ClassicChair implements Chair {
    private static final double PRICE = 100.0;

    @Override
    public double getPrice() {
        return PRICE;
    }

    @Override
    public String getStyle() {
        return "Classic";
    }
}