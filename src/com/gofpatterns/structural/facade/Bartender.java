package com.gofpatterns.structural.facade;

public class Bartender implements Order {

    @Override
    public void makeOrder(String drink) {
        System.out.println("Bartender has made " + drink);
    }
}
