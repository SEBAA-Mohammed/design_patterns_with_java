package com.mohammedsebaa;

import java.sql.SQLException;

public class Retrait implements MethodeTransaction {
    @Override
    public void executer(CompteBancaire compte, Double montant) throws Exception {
        if (montant <= 0) {
            throw new IllegalArgumentException("Le montant du retrait doit être positif");
        }

        if (compte.getSolde() < montant) {
            throw new Exception("Solde insuffisant pour effectuer le retrait");
        }

        Double nouveauSolde = compte.getSolde() - montant;
        compte.setSolde(nouveauSolde);

        try {
            DatabaseConnection.getInstance().mettreAJourSolde(compte.getId(), nouveauSolde);
            DatabaseConnection.getInstance().enregistrerOperation(compte.getId(), "RETRAIT", montant);
        } catch (SQLException e) {
            throw new Exception("Erreur lors de l'enregistrement du retrait", e);
        }
    }
}