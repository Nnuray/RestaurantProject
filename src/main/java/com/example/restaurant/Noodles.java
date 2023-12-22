package com.example.restaurant;

public class Noodles implements Dish{
    private String name;
    private int price;

    public Noodles(String name, int price) {
        this.name = name;
        this.price = price;
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
