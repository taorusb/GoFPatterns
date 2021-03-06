package com.gofpatterns.creational.abstractfactory.hp;

import com.gofpatterns.creational.abstractfactory.Processor;

public class HPProcessor implements Processor {
    @Override
    public void execute() {
        System.out.println("HP processor is executing instructions.");
    }
}