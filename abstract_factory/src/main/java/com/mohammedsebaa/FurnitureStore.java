package com.mohammedsebaa;

import com.mohammedsebaa.factory.FurnitureFactory;
import com.mohammedsebaa.furniture.Chair;
import com.mohammedsebaa.furniture.Cabinet;
import com.mohammedsebaa.furniture.DiningTable;

public class FurnitureStore {
    private final FurnitureFactory factory;
    private static final double PACKAGE_DISCOUNT = 0.15; // 15% discount

    public FurnitureStore(FurnitureFactory factory) {
        this.factory = factory;
    }

    public double sellIndividualChair() {
        return factory.createChair().getPrice();
    }

    public double sellIndividualCabinet() {
        return factory.createCabinet().getPrice();
    }

    public double sellIndividualDiningTable() {
        return factory.createDiningTable().getPrice();
    }

    public double sellPackage() {
        Chair chair = factory.createChair();
        Cabinet cabinet = factory.createCabinet();
        DiningTable diningTable = factory.createDiningTable();

        double totalPrice = chair.getPrice() + cabinet.getPrice() + diningTable.getPrice();
        return totalPrice * (1 - PACKAGE_DISCOUNT);
    }

    public String getStyle() {
        return factory.createChair().getStyle();
    }
}