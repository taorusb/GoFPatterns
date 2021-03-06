package com.gofpatterns.creational.abstractfactory.apple;

import com.gofpatterns.creational.abstractfactory.SSD;

public class AppleSSD implements SSD {
    @Override
    public void saveData() {
        System.out.println("Apple SDD is saving data.");
    }
}
