package com.mohammedsebaa;

public class Guerrier extends Personnage {
    public Guerrier(String nom, int pointsDeVie, int attaque, int defense, String competenceSpeciale) {
        super(nom, pointsDeVie, attaque, defense, competenceSpeciale);
    }

    @Override
    public PersonnagePrototype cloner() {
        return new Guerrier(nom, pointsDeVie, attaque, defense, competenceSpeciale);
    }
}
