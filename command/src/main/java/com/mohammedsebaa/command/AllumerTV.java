package com.mohammedsebaa.command;

public class AllumerTV implements Commande {
    private Television television;

    public AllumerTV(Television television) {
        this.television = television;
    }

    @Override
    public void executer() {
        television.allumer();
    }

    @Override
    public void annuler() {
        television.eteindre();
    }
}
