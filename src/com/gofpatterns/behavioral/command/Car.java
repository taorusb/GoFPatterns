package com.gofpatterns.behavioral.command;

public class Car {

    public void start() {
        System.out.println("The car started up.");
    }

    public void stop() {
        System.out.println("The car stopped.");
    }

    public void turnWheel() {
        System.out.println("The wheel turned.");
    }

    public void openDoor() {
        System.out.println("The door opened.");
    }
}
