package com.gofpatterns.behavioral.command;

public class Driver {

    private Action start;
    private Action stop;
    private Action turnWheel;
    private Action openDoor;

    public Driver(Action start, Action stop, Action turnWheel, Action openDoor) {
        this.start = start;
        this.stop = stop;
        this.turnWheel = turnWheel;
        this.openDoor = openDoor;
    }

    public void openCarDoor() {
        openDoor.executeAction();
    }

    public void startCar() {
        start.executeAction();
    }

    public void turnCarWheel() {
        turnWheel.executeAction();
    }

    public void stopCar() {
        stop.executeAction();
    }
}
