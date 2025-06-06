package com.mohammedsebaa;

import java.util.ArrayList;
import java.util.List;

public class Departement implements ElementOrganisation {
    private String nom;
    private List<ElementOrganisation> elements;

    public Departement(String nom) {
        this.nom = nom;
        this.elements = new ArrayList<>();
    }

    public void ajouter(ElementOrganisation e) {
        elements.add(e);
    }

    public void supprimer(ElementOrganisation e) {
        elements.remove(e);
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public double getCoutTotal() {
        double total = 0;
        for (ElementOrganisation e : elements) {
            total += e.getCoutTotal();
        }
        return total;
    }

    @Override
    public void afficher(String indentation) {
        System.out.println(indentation + "+ Département : " + nom);
        for (ElementOrganisation e : elements) {
            e.afficher(indentation + "    ");
        }
    }
}
