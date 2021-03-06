package com.gofpatterns.behavioral.state;

public class Thread {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void changeState() {
        if (state instanceof NewState) {
            setState(new RunnableState());
        } else if (state instanceof RunnableState) {
            setState(new WaitingState());
        } else if (state instanceof WaitingState) {
            setState(new RunningState());
        } else if (state instanceof RunningState) {
            setState(new TerminatedState());
        }
    }

    public void checkState() {
        state.beAbleTo();
    }
}
