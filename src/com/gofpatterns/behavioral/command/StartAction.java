package com.gofpatterns.behavioral.command;

public class StartAction implements Action {

    private Car car;

    public StartAction(Car car) {
        this.car = car;
    }

    @Override
    public void executeAction() {
        car.start();
    }
}
