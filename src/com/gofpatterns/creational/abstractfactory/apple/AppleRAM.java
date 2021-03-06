package com.gofpatterns.creational.abstractfactory.apple;

import com.gofpatterns.creational.abstractfactory.RAM;

public class AppleRAM implements RAM {
    @Override
    public void getData() {
        System.out.println("Apple RAM is getting data.");
    }
}
