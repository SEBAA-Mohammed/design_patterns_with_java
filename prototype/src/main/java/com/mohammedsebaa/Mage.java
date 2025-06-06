package com.mohammedsebaa;

public class Mage extends Personnage {
    public Mage(String nom, int pointsDeVie, int attaque, int defense, String competenceSpeciale) {
        super(nom, pointsDeVie, attaque, defense, competenceSpeciale);
    }

    @Override
    public PersonnagePrototype cloner() {
        return new Mage(nom, pointsDeVie, attaque, defense, competenceSpeciale);
    }
}
