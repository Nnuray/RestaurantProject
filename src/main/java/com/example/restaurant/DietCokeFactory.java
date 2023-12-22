package com.example.restaurant;

public class DietCokeFactory implements DrinksFactory{
    @Override
    public Drinks createDrink(String name, int price) {
        return new DietCoke(name,price);
    }
}
