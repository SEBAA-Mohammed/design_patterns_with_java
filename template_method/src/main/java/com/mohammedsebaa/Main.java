package com.mohammedsebaa;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Traitement d'une commande PayPal ===");
        OrderProcessing paypalOrder = new PaypalOrderProcessing();
        paypalOrder.processOrder();

        System.out.println("\n=== Traitement d'une commande par carte de crédit ===");
        OrderProcessing creditCardOrder = new CreditCardOrderProcessing();
        creditCardOrder.processOrder();

        System.out.println("\n=== Traitement d'une commande avec livraison standard ===");
        OrderProcessing standardDeliveryOrder = new StandardDeliveryOrderProcessing();
        standardDeliveryOrder.processOrder();
    }
}