package com.gofpatterns.behavioral.mediator;

public class President implements Person {

    private Press press;
    private String name;

    public President(Press press, String name) {
        this.press = press;
        this.name = name;
    }

    @Override
    public void speak(String info) {
        press.notify(info, this);
    }

    @Override
    public void listen(String info) {
        System.out.println(name + " has received message.");
    }
}
