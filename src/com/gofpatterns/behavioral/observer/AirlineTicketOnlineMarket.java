package com.gofpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class AirlineTicketOnlineMarket implements Observed {

    private List<Observer> subscribers;
    private List<String> tickets;

    public AirlineTicketOnlineMarket() {
        subscribers = new ArrayList<>();
        tickets = new ArrayList<>();
    }

    public void addTicket(String ticket) {
        tickets.add(ticket);
        notifySubscribers();
    }

    @Override
    public void addSubscriber(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeSubscriber(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        subscribers.forEach(x -> x.notifyReceipt(tickets));
    }
}
