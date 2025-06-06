package com.mohammedsebaa.factory;

import com.mohammedsebaa.furniture.Chair;
import com.mohammedsebaa.furniture.Cabinet;
import com.mohammedsebaa.furniture.DiningTable;
import com.mohammedsebaa.furniture.contemporary.*;

public class ContemporaryFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ContemporaryChair();
    }

    @Override
    public Cabinet createCabinet() {
        return new ContemporaryCabinet();
    }

    @Override
    public DiningTable createDiningTable() {
        return new ContemporaryDiningTable();
    }
}