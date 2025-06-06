package com.mohammedsebaa;

public class ReservationFacade {
    private VolService volService;
    private PaiementService paiementService;
    private NotificationService notificationService;
    private HistoriqueService historiqueService;

    public ReservationFacade() {
        this.volService = new VolService();
        this.paiementService = new PaiementService();
        this.notificationService = new NotificationService();
        this.historiqueService = new HistoriqueService();
    }

    public void reserverVol(String nom, double montant) {
        volService.rechercherVol(nom);
        volService.reserverVol(nom);
        paiementService.payer(nom, montant);
        notificationService.envoyerConfirmation(nom);
        historiqueService.enregistrerOperation(nom, "Réservation de vol");
        System.out.println("Réservation terminée pour " + nom + "!\n");
    }
}
