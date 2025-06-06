package com.mohammedsebaa;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        CoworkingCenterMediator mediator = new CoworkingCenterMediator();
        BookingManager bookingManager = new BookingManager();
        NotificationService notificationService = new NotificationService();
        AccessControl accessControl = new AccessControl();
        BillingService billingService = new BillingService();
        EnergyMonitor energyMonitor = new EnergyMonitor();

        bookingManager.setMediator(mediator);
        notificationService.setMediator(mediator);
        accessControl.setMediator(mediator);
        billingService.setMediator(mediator);
        energyMonitor.setMediator(mediator);

        mediator.registerBookingManager(bookingManager);
        mediator.registerNotificationService(notificationService);
        mediator.registerAccessControl(accessControl);
        mediator.registerBillingService(billingService);
        mediator.registerEnergyMonitor(energyMonitor);

        // Scénario 1 : Réservation complète
        System.out.println("--- Scénario 1 : Réservation complète ---");
        bookingManager.reserverSalle();
        bookingManager.entreeSalle();
        bookingManager.sortieSalle();

        // Scénario 2 : Annulation
        System.out.println("\n--- Scénario 2 : Annulation ---");
        bookingManager.reserverSalle();
        bookingManager.annulerReservation();

        // Scénario 3 : Surcharge énergétique
        System.out.println("\n--- Scénario 3 : Surcharge énergétique ---");
        bookingManager.reserverSalle();
        bookingManager.entreeSalle(); // EnergyMonitor simule la surcharge
        // Multi-utilisateur (optionnel)
        // ...
    }
}