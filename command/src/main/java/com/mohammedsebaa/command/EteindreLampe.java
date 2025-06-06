package com.mohammedsebaa.command;

public class EteindreLampe implements Commande {
    private Lampe lampe;

    public EteindreLampe(Lampe lampe) {
        this.lampe = lampe;
    }

    @Override
    public void executer() {
        lampe.eteindre();
    }

    @Override
    public void annuler() {
        lampe.allumer();
    }
}
