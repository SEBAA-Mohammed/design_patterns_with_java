package com.mohammedsebaa;

public class CercleFlyweight implements Forme {
    private String couleur; // État intrinsèque

    public CercleFlyweight(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public void dessiner(int x, int y) {
        System.out.println("Dessin d'un cercle de couleur " + couleur + " à la position (" + x + "," + y + ")");
    }
}