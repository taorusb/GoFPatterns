package com.gofpatterns.creational.factorymethod;

public class Client {
    public static void main(String[] args) {
        PhoneFactory factory = new IphoneFactory();
        Phone iphone = factory.createPhone();
        iphone.call();
    }
}
