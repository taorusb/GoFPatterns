package com.gofpatterns.structural.adapter;

public class Computer implements USBTypeC {
    @Override
    public void sendSignal() {
        System.out.println("Computer is sending signal...");
    }
}
