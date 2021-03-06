package com.gofpatterns.structural.adapter;

public class AdapterUSBToHDMI implements HDMI {

    private Computer computer;

    public AdapterUSBToHDMI(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void connect() {
        computer.sendSignal();
    }
}
