package com.mohammedsebaa.furniture.scandinavian;

import com.mohammedsebaa.furniture.Chair;

public class ScandinavianChair implements Chair {
    private static final double PRICE = 150.0;

    @Override
    public double getPrice() {
        return PRICE;
    }

    @Override
    public String getStyle() {
        return "Scandinavian";
    }
} 