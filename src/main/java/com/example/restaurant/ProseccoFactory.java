package com.example.restaurant;

public class ProseccoFactory implements DrinksFactory{
    @Override
    public Drinks createDrink(String name, int price) {
        return new Prosecco(name,price);
    }
}
