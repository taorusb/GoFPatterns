package com.gofpatterns.creational.factorymethod;

public class LGFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new LG();
    }
}
