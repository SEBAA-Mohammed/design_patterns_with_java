package com.mohammedsebaa;

public class CalculateurPrix {
    private StrategieRemise strategieRemise;

    public void setStrategieRemise(StrategieRemise strategieRemise) {
        this.strategieRemise = strategieRemise;
    }

    public double calculerPrixFinal(double montantInitial) {
        if (strategieRemise == null) {
            return montantInitial;
        }
        double remise = strategieRemise.calculerRemise(montantInitial);
        return Math.max(0, montantInitial - remise);
    }
}