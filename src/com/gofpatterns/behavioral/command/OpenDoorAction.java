package com.gofpatterns.behavioral.command;

public class OpenDoorAction implements Action {

    private Car car;

    public OpenDoorAction(Car car) {
        this.car = car;
    }

    @Override
    public void executeAction() {
        car.openDoor();
    }
}
