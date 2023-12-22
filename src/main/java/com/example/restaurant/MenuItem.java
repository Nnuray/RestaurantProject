package com.example.restaurant;

import javafx.scene.text.Text;

public class MenuItem {
    Text name;
    int price;
    CuisineFactory cuisine;
    DrinksFactory drink;

    public MenuItem(Text name, int price,CuisineFactory cuisine) {
        this.name = name;
        this.price = price;
        this.cuisine = cuisine;
    }

    public MenuItem(Text name,int price,DrinksFactory drink){
        this.name = name;
        this.price = price;
        this.drink = drink;
    }

    public Text getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(Text name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
