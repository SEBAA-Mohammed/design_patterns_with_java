package com.mohammedsebaa;

public interface Visitor {
    void visitProduitElectronique(ProduitElectronique e);

    void visitProduitAlimentaire(ProduitAlimentaire a);

    void visitService(Service s);
}
