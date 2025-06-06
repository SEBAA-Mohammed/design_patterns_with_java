package com.mohammedsebaa.factory;

import com.mohammedsebaa.furniture.Chair;
import com.mohammedsebaa.furniture.Cabinet;
import com.mohammedsebaa.furniture.DiningTable;
import com.mohammedsebaa.furniture.scandinavian.*;

public class ScandinavianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ScandinavianChair();
    }

    @Override
    public Cabinet createCabinet() {
        return new ScandinavianCabinet();
    }

    @Override
    public DiningTable createDiningTable() {
        return new ScandinavianDiningTable();
    }
}