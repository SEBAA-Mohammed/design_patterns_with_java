package com.mohammedsebaa;

public class AffichagePrevisions implements Observateur {
    private float temperature;
    private float humidite;
    private float pression;

    @Override
    public void mettreAJour(float temperature, float humidite, float pression) {
        this.temperature = temperature;
        this.humidite = humidite;
        this.pression = pression;
        afficher();
    }

    public void afficher() {
        System.out.println("Affichage Prévisions :");
        System.out.println("Température : " + temperature + "°C, Humidité : " + humidite + "%");
        if (pression > 1013) {
            System.out.println("Amélioration du temps en vue !");
        } else if (pression == 1013) {
            System.out.println("Temps stable.");
        } else {
            System.out.println("Pluie ou temps instable à prévoir.");
        }
    }
}
