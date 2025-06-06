package com.mohammedsebaa;

public class CalculPrixTotalVisitor implements Visitor {
    private double total = 0;

    @Override
    public void visitProduitElectronique(ProduitElectronique e) {
        total += e.getPrix();
    }

    @Override
    public void visitProduitAlimentaire(ProduitAlimentaire a) {
        total += a.getPrix();
    }

    @Override
    public void visitService(Service s) {
        total += s.getPrix();
    }

    public double getTotal() {
        return total;
    }
}
