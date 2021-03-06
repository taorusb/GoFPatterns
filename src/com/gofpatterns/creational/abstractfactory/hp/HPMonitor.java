package com.gofpatterns.creational.abstractfactory.hp;

import com.gofpatterns.creational.abstractfactory.Monitor;

public class HPMonitor implements Monitor {
    @Override
    public void showData() {
        System.out.println("HP monitor is showing data.");
    }
}
