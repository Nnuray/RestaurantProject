package com.example.restaurant;

public interface Customer {
        void addObserver(Observer observer);

        void removeObserver(Observer observer);

        void notifyObservers(String foodItem);
    }


