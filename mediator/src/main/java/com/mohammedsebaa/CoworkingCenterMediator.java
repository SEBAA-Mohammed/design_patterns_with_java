package com.mohammedsebaa;

public class CoworkingCenterMediator implements CoworkingMediator {
    private BookingManager bookingManager;
    private NotificationService notificationService;
    private AccessControl accessControl;
    private BillingService billingService;
    private EnergyMonitor energyMonitor;

    public void registerBookingManager(BookingManager manager) {
        this.bookingManager = manager;
    }

    public void registerNotificationService(NotificationService service) {
        this.notificationService = service;
    }

    public void registerAccessControl(AccessControl control) {
        this.accessControl = control;
    }

    public void registerBillingService(BillingService service) {
        this.billingService = service;
    }

    public void registerEnergyMonitor(EnergyMonitor monitor) {
        this.energyMonitor = monitor;
    }

    @Override
    public void notify(Module sender, String event) {
        // Toutes les communications passent par ce médiateur
        switch (event) {
            case "reservation":
                notificationService.receiveEvent("reservation_confirmee");
                accessControl.receiveEvent("activer_badge");
                break;
            case "annulation":
                notificationService.receiveEvent("reservation_annulee");
                accessControl.receiveEvent("desactiver_badge");
                billingService.receiveEvent("reset");
                energyMonitor.receiveEvent("reset");
                break;
            case "entree":
                billingService.receiveEvent("demarrer_facturation");
                energyMonitor.receiveEvent("demarrer_monitoring");
                break;
            case "sortie":
                accessControl.receiveEvent("desactiver_badge");
                billingService.receiveEvent("arreter_facturation");
                billingService.receiveEvent("generer_facture");
                energyMonitor.receiveEvent("arreter_monitoring");
                break;
            case "surcharge":
                notificationService.receiveEvent("alerte_surcharge");
                break;
            default:
                // rien
        }
    }
}
