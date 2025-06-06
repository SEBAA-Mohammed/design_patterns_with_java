package com.mohammedsebaa;

public class Employe implements ElementOrganisation {
    private String nom;
    private double salaire;

    public Employe(String nom, double salaire) {
        this.nom = nom;
        this.salaire = salaire;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public double getCoutTotal() {
        return salaire;
    }

    @Override
    public void afficher(String indentation) {
        System.out.println(indentation + "- Employé : " + nom + ", Salaire : " + salaire + " $");
    }
}
