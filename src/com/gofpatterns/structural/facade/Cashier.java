package com.gofpatterns.structural.facade;

public class Cashier implements Order {

    @Override
    public void makeOrder(String order) {
        System.out.println("Cashier has taken order: " + order);
    }
}
