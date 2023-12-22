package com.example.restaurant;

public class PolloAlForno implements Dish{
    private String name;
    private int price;
    private String meat;

    public PolloAlForno(String name, int price, String meat) {
        this.name = name;
        this.price = price;
        this.meat = meat;
    }

    public int meatType(String meat){
        int time = 10;
        if (meat.equals("Beef")){
            time+=5;
        }else if(meat.equals("Bacon")){
            time-=6;
        }
        return time;
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
