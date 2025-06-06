package com.mohammedsebaa;

public class AccessControl implements Module {
    private CoworkingMediator mediator;
    private boolean badgeActive = false;

    @Override
    public void setMediator(CoworkingMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void receiveEvent(String event) {
        switch (event) {
            case "activer_badge":
                activerBadge();
                break;
            case "desactiver_badge":
                desactiverBadge();
                break;
        }
    }

    public void activerBadge() {
        badgeActive = true;
        System.out.println("[Accès] Badge activé pour la réservation.");
        // Exemple d'utilisation du médiateur :
        // mediator.notify(this, "badge_active");
    }

    public void desactiverBadge() {
        badgeActive = false;
        System.out.println("[Accès] Badge désactivé.");
        // Exemple d'utilisation du médiateur :
        // mediator.notify(this, "badge_desactive");
    }

    public boolean isBadgeActive() {
        return badgeActive;
    }
}
