package com.mohammedsebaa;

public class Main {
    public static void main(String[] args) {
        // Création de deux utilisateurs
        User user1 = new User("Alice", 1); // Accès faible
        User user2 = new User("Bob", 5); // Accès élevé

        // Chemin d'un fichier texte d'exemple (à adapter si besoin)
        String cheminFichier = "c:/Users/Setup Game/Desktop/Design_Patterns_Ateliers/proxy/src/main/resources/document1.txt";
        String titre = "Document Sensible";
        int niveauRequis = 3;

        // Proxy pour chaque utilisateur
        Document docProxy1 = new DocumentProxy(titre, cheminFichier, user1, niveauRequis);
        Document docProxy2 = new DocumentProxy(titre, cheminFichier, user2, niveauRequis);

        // Tentative d'accès par utilisateur sans droits
        System.out.println("\nTentative d'accès par " + user1.getNom() + ":");
        System.out.println(docProxy1.getContent());

        // Tentative d'accès par utilisateur avec droits
        System.out.println("\nTentative d'accès par " + user2.getNom() + ":");
        System.out.println(docProxy2.getContent());
    }
}