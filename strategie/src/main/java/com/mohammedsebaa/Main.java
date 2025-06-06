package com.mohammedsebaa;

public class Main {
    public static void main(String[] args) {
        CalculateurPrix calculateur = new CalculateurPrix();
        double prixProduit = 100.0;

        // Exemple avec remise fixe de 10€
        calculateur.setStrategieRemise(new RemiseFixe(10));
        System.out.println("Prix avec remise fixe: " + calculateur.calculerPrixFinal(prixProduit) + "$");

        // Exemple avec remise de 20%
        calculateur.setStrategieRemise(new RemisePourcentage(20));
        System.out.println("Prix avec remise pourcentage: " + calculateur.calculerPrixFinal(prixProduit) + "$");

        // Exemple avec remise nouveau client (50%)
        calculateur.setStrategieRemise(new RemiseNouveauClient(50));
        System.out.println("Prix avec remise nouveau client: " + calculateur.calculerPrixFinal(prixProduit) + "$");
        // Deuxième achat - pas de remise
        System.out.println("Prix deuxième achat nouveau client: " + calculateur.calculerPrixFinal(prixProduit) + "$");
    }
}