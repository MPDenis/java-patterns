package com.paterns.strategy;

public class PayPalStrategy implements PaymentStrategy {
    private String email;
    private String pass;

    public PayPalStrategy(String email, String pass) {
        this.email = email;
        this.pass = pass;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with PayPal");
    }
}
