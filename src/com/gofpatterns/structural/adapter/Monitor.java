package com.gofpatterns.structural.adapter;

public class Monitor {

    void showScreen(HDMI port) {
        port.connect();
    }
}
