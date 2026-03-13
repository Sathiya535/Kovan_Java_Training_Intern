package org.kovan.intern.console_store.service;

public class CardPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {

        System.out.println("Payment successful using Card. Amount: ₹" + amount);

    }
}