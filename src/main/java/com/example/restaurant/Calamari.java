package com.example.restaurant;

public class Calamari implements Dish{
    private String name;
    private int price;
    private boolean isSpicy;

    public Calamari(String name, int price, boolean isSpicy) {
        this.name = name;
        this.price = price;
        this.isSpicy = isSpicy;
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
