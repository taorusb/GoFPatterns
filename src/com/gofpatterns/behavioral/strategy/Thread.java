package com.gofpatterns.behavioral.strategy;

public class Thread {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void checkState() {
        state.beAbleTo();
    }
}
