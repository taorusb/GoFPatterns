package com.gofpatterns.creational.factorymethod;

public class MotorolaFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new Motorola();
    }
}
