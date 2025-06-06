package com.mohammedsebaa;

import com.mohammedsebaa.command.*;

public class Main {
    public static void main(String[] args) {
        Television tv = new Television();
        Lampe lampe = new Lampe();

        Commande allumerTV = new AllumerTV(tv);
        Commande eteindreTV = new EteindreTV(tv);
        Commande allumerLampe = new AllumerLampe(lampe);
        Commande eteindreLampe = new EteindreLampe(lampe);

        Telecommande telecommande = new Telecommande();

        // Configuration initiale : ON = TV, OFF = Lampe
        telecommande.setCommandeOn(allumerTV);
        telecommande.setCommandeOff(eteindreLampe);

        System.out.println("--- Appui sur ON (TV) ---");
        telecommande.appuyerOn();
        System.out.println("--- Appui sur OFF (Lampe) ---");
        telecommande.appuyerOff();
        System.out.println("--- Annulation de la dernière commande ---");
        telecommande.appuyerAnnuler();

        // Reprogrammation : ON = Lampe, OFF = TV
        telecommande.setCommandeOn(allumerLampe);
        telecommande.setCommandeOff(eteindreTV);

        System.out.println("\n--- Reprogrammation des boutons ---");
        System.out.println("--- Appui sur ON (Lampe) ---");
        telecommande.appuyerOn();
        System.out.println("--- Appui sur OFF (TV) ---");
        telecommande.appuyerOff();
        System.out.println("--- Annulation de la dernière commande ---");
        telecommande.appuyerAnnuler();
    }
}