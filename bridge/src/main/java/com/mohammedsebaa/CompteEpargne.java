package com.mohammedsebaa;

public class CompteEpargne extends CompteBancaire {
    private Double tauxInteret;

    public CompteEpargne(Long id, Double solde, MethodeTransaction methodTransaction, Double tauxInteret) {
        super(id, solde, methodTransaction);
        this.tauxInteret = tauxInteret;
    }

    @Override
    public void effectuerOperation(Double montant) throws Exception {
        // Pour un compte épargne, on n'autorise pas un solde négatif
        if (this.solde - montant < 0) {
            throw new Exception("Le solde d'un compte épargne ne peut pas être négatif");
        }
        methodTransaction.executer(this, montant);
    }

    public void appliquerInterets() throws Exception {
        Double interets = this.solde * (tauxInteret / 100);
        this.solde += interets;
        DatabaseConnection.getInstance().mettreAJourSolde(this.id, this.solde);
        DatabaseConnection.getInstance().enregistrerOperation(this.id, "INTERETS", interets);
    }

    public Double getTauxInteret() {
        return tauxInteret;
    }
}