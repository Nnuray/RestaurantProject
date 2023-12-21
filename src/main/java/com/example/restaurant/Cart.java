package com.example.restaurant;

import java.io.FileNotFoundException;
import java.util.List;

public interface Cart {
    void update(String message) throws FileNotFoundException;

    void addObserver(Cart observer);

    int calculateTotal(List<MenuItem> list);

}
