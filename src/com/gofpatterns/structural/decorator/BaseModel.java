package com.gofpatterns.structural.decorator;

public class BaseModel implements LaserGun {
    @Override
    public String shoot() {
        return "Base model shooting simple ray ";
    }
}
