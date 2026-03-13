package org.kovan.intern.console_store.service;

public class UPIPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {

        System.out.println("Opening UPI payment gateway...");
        System.out.println("Redirecting to UPI app (GPay / PhonePe / Paytm)...");
        System.out.println("Payment of ₹" + amount + " completed successfully!");

    }
}