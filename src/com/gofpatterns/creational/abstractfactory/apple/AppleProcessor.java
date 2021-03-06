package com.gofpatterns.creational.abstractfactory.apple;

import com.gofpatterns.creational.abstractfactory.Processor;

public class AppleProcessor implements Processor {
    @Override
    public void execute() {
        System.out.println("Apple processor is executing instructions.");
    }
}
