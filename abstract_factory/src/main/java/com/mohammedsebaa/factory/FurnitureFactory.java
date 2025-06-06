package com.mohammedsebaa.factory;

import com.mohammedsebaa.furniture.Chair;
import com.mohammedsebaa.furniture.Cabinet;
import com.mohammedsebaa.furniture.DiningTable;

public interface FurnitureFactory {
    Chair createChair();

    Cabinet createCabinet();

    DiningTable createDiningTable();
}