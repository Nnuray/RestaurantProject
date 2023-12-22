package com.example.restaurant;

public class Mojito implements Drinks{
    private String name;
    private double price;
    private boolean withMint;
    public Mojito(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
