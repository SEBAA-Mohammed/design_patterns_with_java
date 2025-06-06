package com.mohammedsebaa;

import com.mohammedsebaa.factory.*;

public class Main {
    public static void main(String[] args) {
        // Créer des magasins avec différents styles de meubles
        FurnitureStore classicStore = new FurnitureStore(new ClassicFurnitureFactory());
        FurnitureStore contemporaryStore = new FurnitureStore(new ContemporaryFurnitureFactory());
        FurnitureStore scandinavianStore = new FurnitureStore(new ScandinavianFurnitureFactory());

        // Démonstration des ventes individuelles
        System.out.println("=== Ventes Individuelles ===");
        System.out.printf("Chaise %s : %.2f$%n", classicStore.getStyle(), classicStore.sellIndividualChair());
        System.out.printf("Armoire %s : %.2f$%n", contemporaryStore.getStyle(),
                contemporaryStore.sellIndividualCabinet());
        System.out.printf("Table à Manger %s : %.2f$%n", scandinavianStore.getStyle(),
                scandinavianStore.sellIndividualDiningTable());

        // Démonstration des ventes en pack avec 15% de réduction
        System.out.println("\n=== Ventes en Pack (15%% de réduction) ===");
        System.out.printf("Pack %s : %.2f$%n", classicStore.getStyle(), classicStore.sellPackage());
        System.out.printf("Pack %s : %.2f$%n", contemporaryStore.getStyle(), contemporaryStore.sellPackage());
        System.out.printf("Pack %s : %.2f$%n", scandinavianStore.getStyle(), scandinavianStore.sellPackage());
    }
}