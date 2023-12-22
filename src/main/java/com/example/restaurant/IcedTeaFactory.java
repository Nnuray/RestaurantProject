package com.example.restaurant;

public class IcedTeaFactory implements DrinksFactory {
    @Override
    public Drinks createDrink(String name, int price) {
        return new IcedTea(name,price);
    }
}
