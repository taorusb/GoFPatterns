package com.gofpatterns.behavioral.state;

public class WaitingState implements State {
    @Override
    public void beAbleTo() {
        System.out.println("Thread in \"Waiting\" state.");
    }
}
