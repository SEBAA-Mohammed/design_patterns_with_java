package com.mohammedsebaa.furniture.contemporary;

import com.mohammedsebaa.furniture.DiningTable;

public class ContemporaryDiningTable implements DiningTable {
    private static final double PRICE = 450.0;

    @Override
    public double getPrice() {
        return PRICE;
    }

    @Override
    public String getStyle() {
        return "Contemporary";
    }
}