package com.mohammedsebaa;

public class Main {
    private static final String[] COULEURS = { "Rouge", "Vert", "Bleu", "Blanc", "Noir" };

    public static void main(String[] args) {
        // Simuler la création de 20 cercles avec seulement 5 couleurs différentes
        for (int i = 0; i < 20; i++) {
            String couleur = COULEURS[i % COULEURS.length];
            CercleFlyweight cercle = FabriqueCercle.getCercleFlyweight(couleur);
            cercle.dessiner(i * 10, i * 10);
        }

        System.out.println("\nNombre total d'objets cercle créés : " + FabriqueCercle.getNombreDeCercles());
    }
}