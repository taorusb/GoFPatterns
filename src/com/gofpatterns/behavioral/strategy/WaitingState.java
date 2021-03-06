package com.gofpatterns.behavioral.strategy;

public class WaitingState implements State {
    @Override
    public void beAbleTo() {
        System.out.println("Thread in \"Waiting\" state.");
    }
}
