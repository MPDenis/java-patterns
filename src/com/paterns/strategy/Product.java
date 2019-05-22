package com.paterns.strategy;

public class Product {
    private String name;
    private int cost;

    public int getCost() {
        return cost;
    }

    public Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
}
