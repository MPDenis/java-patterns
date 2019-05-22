package com.paterns.strategy;

public class MainClass {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.add(new Product("Bread", 20));
        cart.add(new Product("Milk", 92));
        cart.add(new Product("Butter", 108));
        PaymentStrategy card = new CreditCardStrategy("A", "1", "1", "1");
        PaymentStrategy payPal = new PayPalStrategy("A@A.A", "A");
        cart.pay(card);
        cart.pay(payPal);
    }
}
