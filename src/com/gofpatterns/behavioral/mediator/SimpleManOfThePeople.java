package com.gofpatterns.behavioral.mediator;

public class SimpleManOfThePeople implements Person {

    private String name;
    private Press press;

    public SimpleManOfThePeople(String name, Press press) {
        this.name = name;
        this.press = press;
    }

    @Override
    public void speak(String info) {
        press.notify(info, this);
    }

    @Override
    public void listen(String info) {
        System.out.println("The simple man " + name + " has received message.");
    }
}
