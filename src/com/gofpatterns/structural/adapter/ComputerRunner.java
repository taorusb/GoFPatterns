package com.gofpatterns.structural.adapter;

public class ComputerRunner {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Monitor monitor = new Monitor();
        AdapterUSBToHDMI adapter = new AdapterUSBToHDMI(computer);
        monitor.showScreen(adapter);
    }
}
