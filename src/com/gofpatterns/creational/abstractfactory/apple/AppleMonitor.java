package com.gofpatterns.creational.abstractfactory.apple;

import com.gofpatterns.creational.abstractfactory.Monitor;

public class AppleMonitor implements Monitor {
    @Override
    public void showData() {
        System.out.println("Monitor is showing data.");
    }
}
