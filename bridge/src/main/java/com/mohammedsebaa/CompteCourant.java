package com.mohammedsebaa;

public class CompteCourant extends CompteBancaire {
    private Double decouvertMax;

    public CompteCourant(Long id, Double solde, MethodeTransaction methodTransaction, Double decouvertMax) {
        super(id, solde, methodTransaction);
        this.decouvertMax = decouvertMax;
    }

    @Override
    public void effectuerOperation(Double montant) throws Exception {
        // Vérifier si l'opération ne dépasse pas le découvert autorisé
        if (this.solde - montant < -decouvertMax) {
            throw new Exception("Cette opération dépasserait le découvert maximum autorisé");
        }
        methodTransaction.executer(this, montant);
    }

    public Double getDecouvertMax() {
        return decouvertMax;
    }
}