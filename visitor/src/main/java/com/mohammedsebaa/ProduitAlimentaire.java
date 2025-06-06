package com.mohammedsebaa;

public class ProduitAlimentaire implements PanierElement {
    private String nom;
    private double prix;

    public ProduitAlimentaire(String nom, double prix) {
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
        v.visitProduitAlimentaire(this);
    }
}
