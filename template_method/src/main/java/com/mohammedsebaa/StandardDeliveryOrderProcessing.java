package com.mohammedsebaa;

public class StandardDeliveryOrderProcessing extends OrderProcessing {
    @Override
    protected void choosePaymentMethod() {
        System.out.println("Paiement à la livraison sélectionné");
    }

    @Override
    protected void chooseDeliveryMethod() {
        System.out.println("Méthode de livraison standard sélectionnée");
    }
}