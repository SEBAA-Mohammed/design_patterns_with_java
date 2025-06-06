package com.mohammedsebaa;

public class Main {
    public static void main(String[] args) {
        ReservationFacade facade = new ReservationFacade();
        facade.reserverVol("Mohammed", 250.0);
        facade.reserverVol("Sarah", 320.5);
    }
}