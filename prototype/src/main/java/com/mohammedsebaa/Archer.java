package com.mohammedsebaa;

public class Archer extends Personnage {
    public Archer(String nom, int pointsDeVie, int attaque, int defense, String competenceSpeciale) {
        super(nom, pointsDeVie, attaque, defense, competenceSpeciale);
    }

    @Override
    public PersonnagePrototype cloner() {
        return new Archer(nom, pointsDeVie, attaque, defense, competenceSpeciale);
    }
}
