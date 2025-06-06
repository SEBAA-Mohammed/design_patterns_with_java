package com.mohammedsebaa.command;

public class AllumerLampe implements Commande {
    private Lampe lampe;

    public AllumerLampe(Lampe lampe) {
        this.lampe = lampe;
    }

    @Override
    public void executer() {
        lampe.allumer();
    }

    @Override
    public void annuler() {
        lampe.eteindre();
    }
}
