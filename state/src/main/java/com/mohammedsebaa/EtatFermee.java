package com.mohammedsebaa;

public class EtatFermee implements EtatPorte {
    private Porte porte;

    public EtatFermee(Porte porte) {
        this.porte = porte;
    }

    @Override
    public void ouvrir() {
        System.out.println("La porte commence à s'ouvrir.");
        porte.setEtat(new EtatOuverture(porte));
    }

    @Override
    public void fermer() {
        System.out.println("La porte est déjà fermée.");
    }

    @Override
    public void detecterPersonne() {
        System.out.println("Personne détectée, la porte va s'ouvrir.");
        ouvrir();
    }
}
