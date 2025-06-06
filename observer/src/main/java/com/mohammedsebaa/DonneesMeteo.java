package com.mohammedsebaa;

import java.util.ArrayList;
import java.util.List;

public class DonneesMeteo implements Sujet {
    private List<Observateur> observateurs;
    private float temperature;
    private float humidite;
    private float pression;

    public DonneesMeteo() {
        observateurs = new ArrayList<>();
    }

    @Override
    public void ajouterObservateur(Observateur o) {
        observateurs.add(o);
    }

    @Override
    public void supprimerObservateur(Observateur o) {
        observateurs.remove(o);
    }

    @Override
    public void notifierObservateurs() {
        for (Observateur o : observateurs) {
            o.mettreAJour(temperature, humidite, pression);
        }
    }

    public void setMesures(float temperature, float humidite, float pression) {
        this.temperature = temperature;
        this.humidite = humidite;
        this.pression = pression;
        notifierObservateurs();
    }
}
