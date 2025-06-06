package com.mohammedsebaa;

public class AffichageStatistiques implements Observateur {
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
        System.out.println("Affichage Statistiques :");
        System.out.println("Température moyenne : " + temperature + "°C, Humidité moyenne : " + humidite
                + "%, Pression moyenne : " + pression + " hPa");
    }
}
