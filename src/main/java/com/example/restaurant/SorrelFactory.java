package com.example.restaurant;

public class SorrelFactory implements DrinksFactory{
    @Override
    public Drinks createDrink(String name, int price) {
        return new Sorrel(name, price);
    }
}
