package com.mohammedsebaa;

public class PromotionVisitor implements Visitor {
    @Override
    public void visitProduitElectronique(ProduitElectronique e) {
        // Exemple: 10% de réduction sur les produits électroniques
        double nouveauPrix = e.getPrix() * 0.9;
        System.out.println("Promotion appliquée sur " + e.getNom() + ": nouveau prix = " + nouveauPrix + "$");
    }

    @Override
    public void visitProduitAlimentaire(ProduitAlimentaire a) {
        // Exemple: 5% de réduction sur les produits alimentaires
        double nouveauPrix = a.getPrix() * 0.95;
        System.out.println("Promotion appliquée sur " + a.getNom() + ": nouveau prix = " + nouveauPrix + "$");
    }

    @Override
    public void visitService(Service s) {
        // Pas de promotion sur les services
        System.out.println("Aucune promotion sur le service " + s.getNom());
    }
}
