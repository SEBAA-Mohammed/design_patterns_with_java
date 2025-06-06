package com.mohammedsebaa;

public class AffichageConditions implements Observateur {
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
        System.out.println("Affichage Conditions Actuelles :");
        System.out.println(
                "Température : " + temperature + "°C, Humidité : " + humidite + "%, Pression : " + pression + " hPa");
    }
}
