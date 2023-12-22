package com.example.restaurant;

public class ItalianCuisineFactory implements CuisineFactory{
    @Override
    public Dish createCuisine(String name, int price) {
        return new ItalianCuisine(name,price);
    }
    public Dish createCalamari(String name,int price,boolean isSpicy){
        return new Calamari(name,price,isSpicy);
    }

    public Dish createBolognese(String name,int price,boolean withLemon){
        return new Bolognese(name,price,withLemon);
    }

    public Dish createLobsterBisque(String name,int price){
        return new LobsterBisque(name,price);
    }

    public Dish createPolloAlForno(String name,int price,String meat){
        return new PolloAlForno(name,price,meat);
    }

    public Dish createSalmonSalad(String name,int price){
        return new SalmonSalad(name,price);
    }

}
