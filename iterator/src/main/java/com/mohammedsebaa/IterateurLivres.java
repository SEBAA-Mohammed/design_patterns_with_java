package com.mohammedsebaa;

public class IterateurLivres implements Iterateur {
    private CollectionLivres collection;
    private int index = 0;

    public IterateurLivres(CollectionLivres collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return index < collection.taille();
    }

    @Override
    public Livre next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        return collection.getLivre(index++);
    }
}
