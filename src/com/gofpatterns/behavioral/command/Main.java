package com.gofpatterns.behavioral.command;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Driver driver = new Driver(
                new StartAction(car),
                new StopAction(car),
                new TurnWheelAction(car),
                new OpenDoorAction(car)
        );

        driver.openCarDoor();
        driver.startCar();
        driver.turnCarWheel();
        driver.stopCar();
    }
}
