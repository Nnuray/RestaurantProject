package com.example.restaurant;

public class Bolognese implements Dish{
    private String name;
    private int price;
    private boolean withLemon;

    public Bolognese(String name, int price, boolean withLemon) {
        this.name = name;
        this.price = price;
        this.withLemon = withLemon;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
