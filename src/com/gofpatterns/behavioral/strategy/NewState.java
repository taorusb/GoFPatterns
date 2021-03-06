package com.gofpatterns.behavioral.strategy;

public class NewState implements State {
    @Override
    public void beAbleTo() {
        System.out.println("Thread in \"New\" state.");
    }
}
