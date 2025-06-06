package com.mohammedsebaa;

import java.util.ArrayList;
import java.util.List;

public class CollectionLivres implements Collection {
    private List<Livre> livres = new ArrayList<>();

    public void ajouterLivre(Livre livre) {
        livres.add(livre);
    }

    public Livre getLivre(int index) {
        return livres.get(index);
    }

    public int taille() {
        return livres.size();
    }

    @Override
    public Iterateur createIterator() {
        return new IterateurLivres(this);
    }
}
