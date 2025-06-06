package com.mohammedsebaa;

public class Main {
    public static void main(String[] args) {
        DonneesMeteo donneesMeteo = new DonneesMeteo();
        AffichageConditions affichageConditions = new AffichageConditions();
        AffichageStatistiques affichageStatistiques = new AffichageStatistiques();
        AffichagePrevisions affichagePrevisions = new AffichagePrevisions();

        donneesMeteo.ajouterObservateur(affichageConditions);
        donneesMeteo.ajouterObservateur(affichageStatistiques);
        donneesMeteo.ajouterObservateur(affichagePrevisions);

        System.out.println("--- Mise à jour des mesures météo ---");
        donneesMeteo.setMesures(22.0f, 60.0f, 1012.0f);
        System.out.println("--- Nouvelle mise à jour des mesures météo ---");
        donneesMeteo.setMesures(25.0f, 55.0f, 1015.0f);
    }
}