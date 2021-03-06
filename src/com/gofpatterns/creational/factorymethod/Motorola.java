package com.gofpatterns.creational.factorymethod;

public class Motorola implements Phone {
    @Override
    public void call() {
        System.out.println("Motorola is calling...");
    }
}
