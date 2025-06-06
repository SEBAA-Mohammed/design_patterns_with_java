package com.mohammedsebaa.command;

public class Telecommande {
    private Commande commandeOn;
    private Commande commandeOff;
    private Commande derniereCommande;

    public void setCommandeOn(Commande commandeOn) {
        this.commandeOn = commandeOn;
    }

    public void setCommandeOff(Commande commandeOff) {
        this.commandeOff = commandeOff;
    }

    public void appuyerOn() {
        if (commandeOn != null) {
            commandeOn.executer();
            derniereCommande = commandeOn;
        } else {
            System.out.println("Aucune commande ON n'est programmée.");
        }
    }

    public void appuyerOff() {
        if (commandeOff != null) {
            commandeOff.executer();
            derniereCommande = commandeOff;
        } else {
            System.out.println("Aucune commande OFF n'est programmée.");
        }
    }

    public void appuyerAnnuler() {
        if (derniereCommande != null) {
            derniereCommande.annuler();
        } else {
            System.out.println("Aucune commande à annuler.");
        }
    }
}
