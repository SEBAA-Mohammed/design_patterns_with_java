package com.mohammedsebaa;

public class EtatFermeture implements EtatPorte {
    private Porte porte;

    public EtatFermeture(Porte porte) {
        this.porte = porte;
    }

    @Override
    public void ouvrir() {
        System.out.println("Arrêt de la fermeture, la porte commence à s'ouvrir.");
        porte.setEtat(new EtatOuverture(porte));
    }

    @Override
    public void fermer() {
        System.out.println("La porte est déjà en train de se fermer.");
    }

    @Override
    public void detecterPersonne() {
        System.out.println("Personne détectée, la porte s'ouvre à nouveau.");
        ouvrir();
    }

    // Méthode pour simuler la fin de la fermeture
    public void finFermeture() {
        System.out.println("La porte est maintenant fermée.");
        porte.setEtat(new EtatFermee(porte));
    }
}
