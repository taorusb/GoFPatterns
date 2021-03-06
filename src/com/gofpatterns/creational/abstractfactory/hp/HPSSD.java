package com.gofpatterns.creational.abstractfactory.hp;

import com.gofpatterns.creational.abstractfactory.SSD;

public class HPSSD implements SSD {
    @Override
    public void saveData() {
        System.out.println("HP SSD saving data.");
    }
}
