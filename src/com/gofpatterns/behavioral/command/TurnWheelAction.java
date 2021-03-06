package com.gofpatterns.behavioral.command;

public class TurnWheelAction implements Action {

    private Car car;

    public TurnWheelAction(Car car) {
        this.car = car;
    }

    @Override
    public void executeAction() {
        car.turnWheel();
    }
}
