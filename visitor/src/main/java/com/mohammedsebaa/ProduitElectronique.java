package com.mohammedsebaa;

public class ProduitElectronique implements PanierElement {
    private String nom;
    private double prix;

    public ProduitElectronique(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    @Override
    public void accept(Visitor v) {
        v.visitProduitElectronique(this);
    }
}
