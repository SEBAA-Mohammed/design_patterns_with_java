package com.mohammedsebaa.furniture.classic;

import com.mohammedsebaa.furniture.DiningTable;

public class ClassicDiningTable implements DiningTable {
    private static final double PRICE = 400.0;

    @Override
    public double getPrice() {
        return PRICE;
    }

    @Override
    public String getStyle() {
        return "Classic";
    }
}