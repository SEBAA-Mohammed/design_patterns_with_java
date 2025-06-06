package com.mohammedsebaa;

public class Main {
    public static void main(String[] args) {

        // Création des éléments du panier
        PanierElement[] panier = new PanierElement[] {
                new ProduitElectronique("Ordinateur portable", 1200),
                new ProduitAlimentaire("Pommes", 5),
                new Service("Livraison", 20)
        };

        // Calcul du prix total
        CalculPrixTotalVisitor calculVisitor = new CalculPrixTotalVisitor();
        for (PanierElement e : panier) {
            e.accept(calculVisitor);
        }
        System.out.println("Prix total du panier : " + calculVisitor.getTotal() + "$");

        // Application des promotions
        System.out.println("\n--- Promotions ---");
        PromotionVisitor promoVisitor = new PromotionVisitor();
        for (PanierElement e : panier) {
            e.accept(promoVisitor);
        }

        // Génération de la facture
        FactureVisitor factureVisitor = new FactureVisitor();
        for (PanierElement e : panier) {
            e.accept(factureVisitor);
        }
        System.out.println("\n--- Facture ---\n" + factureVisitor.getFacture());
    }
}