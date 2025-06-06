package com.mohammedsebaa;

public class Main {
    public static void main(String[] args) {

        Guerrier guerrier1 = new Guerrier("Léon", 150, 40, 30, "Coup puissant");
        Archer archer1 = new Archer("Robin", 100, 30, 20, "Tir précis");
        Mage mage1 = new Mage("Merlin", 80, 50, 15, "Boule de feu");

        System.out.println("--- Personnages originaux ---");
        guerrier1.afficherInfos();
        System.out.println();
        archer1.afficherInfos();
        System.out.println();
        mage1.afficherInfos();
        System.out.println();

        // Clonage
        Guerrier guerrierClone = (Guerrier) guerrier1.cloner();
        Archer archerClone = (Archer) archer1.cloner();
        Mage mageClone = (Mage) mage1.cloner();

        System.out.println("--- Clones créés rapidement ---");
        guerrierClone.afficherInfos();
        System.out.println();
        archerClone.afficherInfos();
        System.out.println();
        mageClone.afficherInfos();
        System.out.println();
        System.out.println("Clonage terminé avec succès !");
    }
}