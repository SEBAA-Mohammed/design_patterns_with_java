package com.mohammedsebaa.furniture.scandinavian;

import com.mohammedsebaa.furniture.DiningTable;

public class ScandinavianDiningTable implements DiningTable {
    private static final double PRICE = 500.0;

    @Override
    public double getPrice() {
        return PRICE;
    }

    @Override
    public String getStyle() {
        return "Scandinavian";
    }
}