package com.gofpatterns.creational.factorymethod;

public class Iphone implements Phone {
    @Override
    public void call() {
        System.out.println("iPhone is calling...");
    }
}
