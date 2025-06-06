package com.mohammedsebaa;

public class Main {
    public static void main(String[] args) {
        CollectionLivres collection = new CollectionLivres();
        collection.ajouterLivre(new Livre("Le Petit Prince", "Antoine de Saint-Exupéry"));
        collection.ajouterLivre(new Livre("L'Étranger", "Albert Camus"));
        collection.ajouterLivre(new Livre("Les Misérables", "Victor Hugo"));
        collection.ajouterLivre(new Livre("Le Comte de Monte-Cristo", "Alexandre Dumas"));
        collection.ajouterLivre(new Livre("Candide", "Voltaire"));

        Iterateur iterateur = collection.createIterator();
        System.out.println("Liste des livres dans la bibliothèque :");
        while (iterateur.hasNext()) {
            Livre livre = iterateur.next();
            System.out.println("Titre : " + livre.getTitre() + ", Auteur : " + livre.getAuteur());
        }
    }
}