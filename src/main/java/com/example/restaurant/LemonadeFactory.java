package com.example.restaurant;

public class LemonadeFactory implements DrinksFactory{
    @Override
    public Drinks createDrink(String name, int price) {
        return new Lemonade(name,price);
    }
}
