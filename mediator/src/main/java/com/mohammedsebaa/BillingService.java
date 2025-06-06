package com.mohammedsebaa;

public class BillingService implements Module {
    private CoworkingMediator mediator;
    private long startTime;
    private long endTime;
    private boolean isFacturationActive = false;

    @Override
    public void setMediator(CoworkingMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void receiveEvent(String event) {
        switch (event) {
            case "demarrer_facturation":
                demarrerFacturation();
                break;
            case "arreter_facturation":
                arreterFacturation();
                break;
            case "generer_facture":
                genererFacture();
                break;
            case "reset":
                isFacturationActive = false;
                startTime = 0;
                endTime = 0;
                break;
        }
    }

    public void demarrerFacturation() {
        if (!isFacturationActive) {
            startTime = System.currentTimeMillis();
            isFacturationActive = true;
            System.out.println("[Facturation] Facturation démarrée.");
            // Exemple d'utilisation du médiateur :
            // mediator.notify(this, "facturation_start");
        }
    }

    public void arreterFacturation() {
        if (isFacturationActive) {
            endTime = System.currentTimeMillis();
            isFacturationActive = false;
            System.out.println("[Facturation] Facturation arrêtée.");
            // Exemple d'utilisation du médiateur :
            // mediator.notify(this, "facturation_stop");
        }
    }

    public void genererFacture() {
        if (startTime > 0 && endTime > 0) {
            long duree = (endTime - startTime) / 1000; // en secondes
            double montant = duree * 0.5; // 0.5€/seconde (exemple)
            System.out.println("[Facturation] Facture générée : " + montant + "€ pour " + duree + " secondes.");
        } else {
            System.out.println("[Facturation] Impossible de générer la facture : données incomplètes.");
        }
    }
}
