package com.mohammedsebaa;

public class EtatOuverte implements EtatPorte {
    private Porte porte;

    public EtatOuverte(Porte porte) {
        this.porte = porte;
    }

    @Override
    public void ouvrir() {
        System.out.println("La porte est déjà ouverte.");
    }

    @Override
    public void fermer() {
        System.out.println("La porte commence à se fermer.");
        porte.setEtat(new EtatFermeture(porte));
    }

    @Override
    public void detecterPersonne() {
        System.out.println("La porte est déjà ouverte pour la personne.");
    }
}
