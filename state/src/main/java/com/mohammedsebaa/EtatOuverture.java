package com.mohammedsebaa;

public class EtatOuverture implements EtatPorte {
    private Porte porte;

    public EtatOuverture(Porte porte) {
        this.porte = porte;
    }

    @Override
    public void ouvrir() {
        System.out.println("La porte est déjà en train de s'ouvrir.");
    }

    @Override
    public void fermer() {
        System.out.println("Arrêt de l'ouverture, la porte commence à se fermer.");
        porte.setEtat(new EtatFermeture(porte));
    }

    @Override
    public void detecterPersonne() {
        System.out.println("La porte continue de s'ouvrir pour la personne.");
    }

    // Méthode pour simuler la fin de l'ouverture
    public void finOuverture() {
        System.out.println("La porte est maintenant ouverte.");
        porte.setEtat(new EtatOuverte(porte));
    }
}
