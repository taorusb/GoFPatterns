package com.gofpatterns.creational.factorymethod;

public class LG implements Phone {
    @Override
    public void call() {
        System.out.println("LG is calling...");
    }
}
