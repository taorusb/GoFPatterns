package com.gofpatterns.behavioral.state;

public class RunnableState implements State {
    @Override
    public void beAbleTo() {
        System.out.println("Thread in \"Runnable\" state.");
    }
}
