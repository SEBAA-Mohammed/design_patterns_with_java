package com.mohammedsebaa;

public class RemisePourcentage implements StrategieRemise {
    private final double pourcentage;

    public RemisePourcentage(double pourcentage) {
        this.pourcentage = pourcentage;
    }

    @Override
    public double calculerRemise(double montant) {
        return montant * (pourcentage / 100.0);
    }
}