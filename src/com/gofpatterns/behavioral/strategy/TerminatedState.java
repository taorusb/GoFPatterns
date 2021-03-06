package com.gofpatterns.behavioral.strategy;

public class TerminatedState implements State {
    @Override
    public void beAbleTo() {
        System.out.println("Thread in \"Terminated\" state.");
    }
}
