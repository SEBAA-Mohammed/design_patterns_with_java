package com.mohammedsebaa;

import java.util.HashMap;
import java.util.Map;

public class FabriqueCercle {
    private static final Map<String, CercleFlyweight> cerclemap = new HashMap<>();

    public static CercleFlyweight getCercleFlyweight(String couleur) {
        CercleFlyweight cercle = cerclemap.get(couleur);

        if (cercle == null) {
            cercle = new CercleFlyweight(couleur);
            cerclemap.put(couleur, cercle);
            System.out.println("Création d'un nouveau cercle de couleur : " + couleur);
        }
        return cercle;
    }

    public static int getNombreDeCercles() {
        return cerclemap.size();
    }
}