package com.gofpatterns.behavioral.state;

public class NewState implements State {
    @Override
    public void beAbleTo() {
        System.out.println("Thread in \"New\" state.");
    }
}
