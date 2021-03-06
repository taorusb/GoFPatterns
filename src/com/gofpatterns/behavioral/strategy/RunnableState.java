package com.gofpatterns.behavioral.strategy;

public class RunnableState implements State {
    @Override
    public void beAbleTo() {
        System.out.println("Thread in \"Runnable\" state.");
    }
}
