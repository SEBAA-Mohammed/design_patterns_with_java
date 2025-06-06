package com.mohammedsebaa;

public class FactureVisitor implements Visitor {
    private StringBuilder facture = new StringBuilder();
    private double total = 0;

    @Override
    public void visitProduitElectronique(ProduitElectronique e) {
        facture.append("Produit électronique: ").append(e.getNom())
                .append(" - ").append(e.getPrix()).append("$\n");
        total += e.getPrix();
    }

    @Override
    public void visitProduitAlimentaire(ProduitAlimentaire a) {
        facture.append("Produit alimentaire: ").append(a.getNom())
                .append(" - ").append(a.getPrix()).append("$\n");
        total += a.getPrix();
    }

    @Override
    public void visitService(Service s) {
        facture.append("Service: ").append(s.getNom())
                .append(" - ").append(s.getPrix()).append("$\n");
        total += s.getPrix();
    }

    public String getFacture() {
        facture.append("Total: ").append(total).append("$\n");
        return facture.toString();
    }
}
