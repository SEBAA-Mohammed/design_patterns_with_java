package com.mohammedsebaa;

public class Main {
    public static void main(String[] args) {
        Porte porte = new Porte();
        porte.detecterPersonne();
        // Simuler la fin de l'ouverture
        ((EtatOuverture) ((Porte) porte).getEtat()).finOuverture();
        porte.fermer(); // La porte commence à se fermer
        // Simuler la fin de la fermeture
        ((EtatFermeture) ((Porte) porte).getEtat()).finFermeture();
        porte.ouvrir();
    }
}