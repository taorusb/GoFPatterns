package com.gofpatterns.behavioral.observer;

import java.util.List;

public class Subscriber implements Observer {

    private String username;

    public Subscriber(String username) {
        this.username = username;
    }

    @Override
    public void notifyReceipt(List<String> tickets) {
        System.out.println(username + " there are new tickets in our store\n" + tickets);
    }
}
