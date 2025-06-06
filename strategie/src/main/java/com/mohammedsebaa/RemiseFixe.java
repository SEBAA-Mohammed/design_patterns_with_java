package com.mohammedsebaa;

public class RemiseFixe implements StrategieRemise {
    private final double montantFixe;

    public RemiseFixe(double montantFixe) {
        this.montantFixe = montantFixe;
    }

    @Override
    public double calculerRemise(double montant) {
        return Math.min(montant, montantFixe);
    }
}