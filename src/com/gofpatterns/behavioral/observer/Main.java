package com.gofpatterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {

        AirlineTicketOnlineMarket market = new AirlineTicketOnlineMarket();
        market.addTicket("Paris-Madrid");
        market.addTicket("Paris-NewYork");

        market.addSubscriber(new Subscriber("Joshua"));
        market.addSubscriber(new Subscriber("Peter"));

        market.addTicket("Paris-Berlin");


    }
}
