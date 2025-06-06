package com.mohammedsebaa;

public abstract class CompteBancaire {
    protected Long id;
    protected Double solde;
    protected MethodeTransaction methodTransaction;

    public CompteBancaire(Long id, Double solde, MethodeTransaction methodTransaction) {
        this.id = id;
        this.solde = solde;
        this.methodTransaction = methodTransaction;
    }

    public abstract void effectuerOperation(Double montant) throws Exception;

    public Double getSolde() {
        return solde;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    public Long getId() {
        return id;
    }
}