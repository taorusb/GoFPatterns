package com.gofpatterns.behavioral.templatemethod;

public class SimulatorStarter {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Metro metro = new Metro();
        bus.startTheDay();
        System.out.println("********************");
        metro.startTheDay();
    }
}
