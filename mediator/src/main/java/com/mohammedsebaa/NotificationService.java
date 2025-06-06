package com.mohammedsebaa;

public class NotificationService implements Module {
    private CoworkingMediator mediator;

    @Override
    public void setMediator(CoworkingMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void receiveEvent(String event) {
        switch (event) {
            case "reservation_confirmee":
                envoyerNotification("Votre réservation est confirmée.");
                break;
            case "reservation_annulee":
                envoyerNotification("Votre réservation a été annulée.");
                break;
            case "alerte_surcharge":
                envoyerNotification("Alerte : Surcharge énergétique détectée !");
                break;
        }
    }

    public void envoyerNotification(String message) {
        System.out.println("[Notification] " + message);
        // Exemple d'utilisation du médiateur :
        // if (mediator != null) mediator.notify(this, "notification_envoyee");
    }
}
