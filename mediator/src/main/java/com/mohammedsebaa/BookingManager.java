package com.mohammedsebaa;

public class BookingManager implements Module {
    private CoworkingMediator mediator;

    @Override
    public void setMediator(CoworkingMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void receiveEvent(String event) {
        // Pas d'action spécifique pour BookingManager
    }

    public void reserverSalle() {
        System.out.println("[Réservation] Salle réservée avec succès.");
        mediator.notify(this, "reservation");
    }

    public void annulerReservation() {
        System.out.println("[Réservation] Réservation annulée.");
        mediator.notify(this, "annulation");
    }

    public void entreeSalle() {
        System.out.println("[Réservation] L'utilisateur entre dans la salle.");
        mediator.notify(this, "entree");
    }

    public void sortieSalle() {
        System.out.println("[Réservation] L'utilisateur sort de la salle.");
        mediator.notify(this, "sortie");
    }
}
