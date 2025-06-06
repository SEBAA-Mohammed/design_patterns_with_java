package com.mohammedsebaa;

public class User {
    private String nom;
    private int niveauAcces;

    public User(String nom, int niveauAcces) {
        this.nom = nom;
        this.niveauAcces = niveauAcces;
    }

    public String getNom() {
        return nom;
    }

    public int getNiveauAcces() {
        return niveauAcces;
    }
}
