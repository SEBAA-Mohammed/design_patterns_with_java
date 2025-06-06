package com.mohammedsebaa.factory;

import com.mohammedsebaa.furniture.Chair;
import com.mohammedsebaa.furniture.Cabinet;
import com.mohammedsebaa.furniture.DiningTable;
import com.mohammedsebaa.furniture.classic.*;

public class ClassicFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ClassicChair();
    }

    @Override
    public Cabinet createCabinet() {
        return new ClassicCabinet();
    }

    @Override
    public DiningTable createDiningTable() {
        return new ClassicDiningTable();
    }
}