package com.mohammedsebaa;

public class RemiseNouveauClient implements StrategieRemise {
    private final double pourcentagePremierAchat;
    private boolean remiseUtilisee = false;

    public RemiseNouveauClient(double pourcentagePremierAchat) {
        this.pourcentagePremierAchat = pourcentagePremierAchat;
    }

    @Override
    public double calculerRemise(double montant) {
        if (!remiseUtilisee) {
            remiseUtilisee = true;
            return montant * (pourcentagePremierAchat / 100.0);
        }
        return 0;
    }
}