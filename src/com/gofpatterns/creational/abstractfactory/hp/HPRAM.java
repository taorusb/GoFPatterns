package com.gofpatterns.creational.abstractfactory.hp;

import com.gofpatterns.creational.abstractfactory.RAM;

public class HPRAM implements RAM {
    @Override
    public void getData() {
        System.out.println("HP RAM is getting data.");
    }
}
