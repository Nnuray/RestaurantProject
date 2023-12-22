package com.example.restaurant;

import java.util.List;

public interface Observer {
    void foodIsDone(List<MenuItem> list,String message);
}
