package com.example.restaurant;

public class ChineseCuisineFactory implements CuisineFactory{
    @Override
    public Dish createCuisine(String name, int price) {
        return new ChineseCuisine(name,price);
    }
}
