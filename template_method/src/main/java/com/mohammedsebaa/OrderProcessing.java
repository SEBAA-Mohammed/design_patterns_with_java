package com.mohammedsebaa;

public abstract class OrderProcessing {
    // Template method
    public final void processOrder() {
        validateOrder();
        choosePaymentMethod();
        makePayment();
        chooseDeliveryMethod();
        deliverOrder();
    }

    protected void validateOrder() {
        System.out.println("Validation de la commande...");
    }

    protected void makePayment() {
        System.out.println("Traitement du paiement...");
    }

    protected void deliverOrder() {
        System.out.println("Livraison de la commande...");
    }

    protected abstract void choosePaymentMethod();

    protected abstract void chooseDeliveryMethod();
}