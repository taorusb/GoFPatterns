package com.gofpatterns.behavioral.strategy;

public class RunningState implements State {
    @Override
    public void beAbleTo() {
        System.out.println("Thread in \"Running\" state.");
    }
}
