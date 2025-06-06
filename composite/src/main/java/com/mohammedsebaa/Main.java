package com.mohammedsebaa;

public class Main {
    public static void main(String[] args) {
        // Création des employés
        Employe e1 = new Employe("Alice", 3000);
        Employe e2 = new Employe("Bob", 2500);
        Employe e3 = new Employe("Claire", 2800);
        Employe e4 = new Employe("David", 3200);

        // Création des départements
        Departement dev = new Departement("Développement");
        Departement rh = new Departement("Ressources Humaines");
        Departement entreprise = new Departement("Entreprise");

        // Ajout des employés aux départements
        dev.ajouter(e1);
        dev.ajouter(e2);
        rh.ajouter(e3);
        rh.ajouter(e4);

        // Ajout des départements à l'entreprise
        entreprise.ajouter(dev);
        entreprise.ajouter(rh);

        // Affichage de la structure
        System.out.println("Structure de l'entreprise :");
        entreprise.afficher("");

        // Affichage du coût total
        System.out.println("\nCoût total de l'entreprise : " + entreprise.getCoutTotal() + " $");
    }
}