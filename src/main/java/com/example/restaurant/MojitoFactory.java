package com.example.restaurant;

public class MojitoFactory implements DrinksFactory{
    @Override
    public Drinks createDrink(String name, int price) {
        return new Mojito(name,price);
    }
}
