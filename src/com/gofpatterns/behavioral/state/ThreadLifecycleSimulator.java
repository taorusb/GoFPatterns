package com.gofpatterns.behavioral.state;

public class ThreadLifecycleSimulator {
    public static void main(String[] args) {

        State state = new NewState();
        Thread thread = new Thread();
        thread.setState(state);

        for (int i = 0; i < 5; i++) {
            thread.checkState();
            thread.changeState();
        }
    }
}
