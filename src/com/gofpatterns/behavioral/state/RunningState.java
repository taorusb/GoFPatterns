package com.gofpatterns.behavioral.state;

public class RunningState implements State {
    @Override
    public void beAbleTo() {
        System.out.println("Thread in \"Running\" state.");
    }
}
