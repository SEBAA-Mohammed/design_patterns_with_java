package com.mohammedsebaa;

public class PaypalOrderProcessing extends OrderProcessing {
    @Override
    protected void choosePaymentMethod() {
        System.out.println("Paiement via PayPal sélectionné");
    }

    @Override
    protected void chooseDeliveryMethod() {
        System.out.println("Méthode de livraison express pour PayPal sélectionnée");
    }
}