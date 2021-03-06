package com.gofpatterns.structural.facade;

public class Cooker implements Order {

    @Override
    public void makeOrder(String dish) {
        System.out.println("Cooker has made " + dish);
    }
}
