package com.mohammedsebaa;

public abstract class Personnage implements PersonnagePrototype {
    protected String nom;
    protected int pointsDeVie;
    protected int attaque;
    protected int defense;
    protected String competenceSpeciale;

    public Personnage(String nom, int pointsDeVie, int attaque, int defense, String competenceSpeciale) {
        this.nom = nom;
        this.pointsDeVie = pointsDeVie;
        this.attaque = attaque;
        this.defense = defense;
        this.competenceSpeciale = competenceSpeciale;
    }

    public void afficherInfos() {
        System.out.println("Nom : " + nom);
        System.out.println("Points de vie : " + pointsDeVie);
        System.out.println("Attaque : " + attaque);
        System.out.println("Défense : " + defense);
        System.out.println("Compétence spéciale : " + competenceSpeciale);
    }
}
