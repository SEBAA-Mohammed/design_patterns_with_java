package com.mohammedsebaa;

public class CreditCardOrderProcessing extends OrderProcessing {
    @Override
    protected void choosePaymentMethod() {
        System.out.println("Paiement par carte de crédit sélectionné");
    }

    @Override
    protected void chooseDeliveryMethod() {
        System.out.println("Méthode de livraison standard pour carte de crédit sélectionnée");
    }
}