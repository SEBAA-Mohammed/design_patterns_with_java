package com.mohammedsebaa;

public class Service implements PanierElement {
    private String nom;
    private double prix;

    public Service(String nom, double prix) {
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
        v.visitService(this);
    }
}
