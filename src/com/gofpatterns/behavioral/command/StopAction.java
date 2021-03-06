package com.gofpatterns.behavioral.command;

public class StopAction implements Action {

    private Car car;

    public StopAction(Car car) {
        this.car = car;
    }

    @Override
    public void executeAction() {
        car.stop();
    }
}
