package com.mohammedsebaa.command;

public class EteindreTV implements Commande {
    private Television television;

    public EteindreTV(Television television) {
        this.television = television;
    }

    @Override
    public void executer() {
        television.eteindre();
    }

    @Override
    public void annuler() {
        television.allumer();
    }
}
