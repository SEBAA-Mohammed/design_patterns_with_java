package com.mohammedsebaa;

public class EnergyMonitor implements Module {
    private CoworkingMediator mediator;
    private boolean monitoring = false;
    private double consommation = 0;
    private static final double SEUIL = 100.0;

    @Override
    public void setMediator(CoworkingMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void receiveEvent(String event) {
        switch (event) {
            case "demarrer_monitoring":
                demarrerMonitoring();
                break;
            case "arreter_monitoring":
                arreterMonitoring();
                break;
            case "reset":
                consommation = 0;
                monitoring = false;
                break;
        }
    }

    public void demarrerMonitoring() {
        monitoring = true;
        consommation = Math.random() * 150; // Simule une consommation aléatoire
        System.out.println("[Energie] Monitoring démarré. Consommation : " + consommation + " kWh");
        verifierConsommation();
        // Exemple d'utilisation du médiateur :
        // mediator.notify(this, "monitoring_start");
    }

    public void arreterMonitoring() {
        monitoring = false;
        System.out.println("[Energie] Monitoring arrêté.");
    }

    public void verifierConsommation() {
        if (consommation > SEUIL) {
            System.out.println("[Energie] Surcharge détectée !");
            mediator.notify(this, "surcharge");
        }
    }
}
