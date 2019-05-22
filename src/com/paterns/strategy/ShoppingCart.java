package com.paterns.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void add(Product p) {
        this.products.add(p);
    }

    public int total() {
        int sum = 0;
        for (Product o : products) {
            sum += o.getCost();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentStrategy) {
        int amount = total();
        paymentStrategy.pay(amount);
    }
}
