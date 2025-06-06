package com.mohammedsebaa;

import java.sql.SQLException;

public class Virement implements MethodeTransaction {
    private CompteBancaire compteDestination;

    public Virement(CompteBancaire compteDestination) {
        this.compteDestination = compteDestination;
    }

    @Override
    public void executer(CompteBancaire compteSource, Double montant) throws Exception {
        if (montant <= 0) {
            throw new IllegalArgumentException("Le montant du virement doit être positif");
        }

        if (compteSource.getSolde() < montant) {
            throw new Exception("Solde insuffisant pour effectuer le virement");
        }

        // Débiter le compte source
        Double nouveauSoldeSource = compteSource.getSolde() - montant;
        compteSource.setSolde(nouveauSoldeSource);

        // Créditer le compte destination
        Double nouveauSoldeDestination = compteDestination.getSolde() + montant;
        compteDestination.setSolde(nouveauSoldeDestination);

        try {
            DatabaseConnection db = DatabaseConnection.getInstance();

            // Mettre à jour les soldes
            db.mettreAJourSolde(compteSource.getId(), nouveauSoldeSource);
            db.mettreAJourSolde(compteDestination.getId(), nouveauSoldeDestination);

            // Enregistrer les opérations
            db.enregistrerOperation(compteSource.getId(), "VIREMENT_DEBIT", montant);
            db.enregistrerOperation(compteDestination.getId(), "VIREMENT_CREDIT", montant);
        } catch (SQLException e) {
            throw new Exception("Erreur lors de l'enregistrement du virement", e);
        }
    }
}