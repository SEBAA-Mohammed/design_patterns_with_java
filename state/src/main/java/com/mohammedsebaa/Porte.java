package com.mohammedsebaa;

public class Porte {
    private EtatPorte etat;

    public Porte() {
        this.etat = new EtatFermee(this);
    }

    public void setEtat(EtatPorte etat) {
        this.etat = etat;
    }

    public void ouvrir() {
        etat.ouvrir();
    }

    public void fermer() {
        etat.fermer();
    }

    public void detecterPersonne() {
        etat.detecterPersonne();
    }

    public EtatPorte getEtat() {
        return etat;
    }
}
