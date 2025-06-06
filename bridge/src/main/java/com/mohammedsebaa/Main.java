package com.mohammedsebaa;

public class Main {
    public static void main(String[] args) {
        try {
            // Créer les comptes dans la base de données
            DatabaseConnection db = DatabaseConnection.getInstance();
            db.creerCompte(1L, "COURANT", 1000.0);
            db.creerCompte(2L, "EPARGNE", 5000.0);

            // Créer les objets comptes
            CompteCourant compteCourant = new CompteCourant(1L, 1000.0, new Retrait(), 500.0);
            CompteEpargne compteEpargne = new CompteEpargne(2L, 5000.0, new Retrait(), 2.5);

            // Effectuer un retrait sur le compte courant
            System.out.println("Solde initial compte courant: " + compteCourant.getSolde());
            compteCourant.effectuerOperation(300.0);
            System.out.println("Solde après retrait de 300€: " + compteCourant.getSolde());

            // Effectuer un virement du compte épargne vers le compte courant
            System.out.println("\nSolde initial compte épargne: " + compteEpargne.getSolde());
            MethodeTransaction virement = new Virement(compteCourant);
            compteEpargne.methodTransaction = virement;
            compteEpargne.effectuerOperation(1000.0);
            System.out.println("Solde compte épargne après virement de 1000€: " + compteEpargne.getSolde());
            System.out.println("Solde compte courant après réception du virement: " + compteCourant.getSolde());

            // Appliquer les intérêts sur le compte épargne
            compteEpargne.appliquerInterets();
            System.out.println("\nSolde compte épargne après application des intérêts: " + compteEpargne.getSolde());

        } catch (Exception e) {
            System.err.println("Erreur: " + e.getMessage());
            e.printStackTrace();
        }
    }
}