package com.gofpatterns.behavioral.strategy;

public class ThreadLifecycleSimulator {
    public static void main(String[] args) {

        Thread thread = new Thread();

        thread.setState(new NewState());
        thread.checkState();

        thread.setState(new RunnableState());
        thread.checkState();

        thread.setState(new WaitingState());
        thread.checkState();

        thread.setState(new RunningState());
        thread.checkState();

        thread.setState(new TerminatedState());
        thread.checkState();
    }
}
