package com.gofpatterns.creational.factorymethod;

public class IphoneFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new Iphone();
    }
}
