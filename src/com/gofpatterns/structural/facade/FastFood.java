package com.gofpatterns.structural.facade;

public class FastFood {

    private Bartender bartender;
    private Cooker cooker;
    private Cashier cashier;

    public FastFood() {
        bartender = new Bartender();
        cooker = new Cooker();
        cashier = new Cashier();
    }

    public void executeOrder(String drink, String dish) {
        cashier.makeOrder(drink + " " + dish);
        bartender.makeOrder(drink);
        cooker.makeOrder(dish);
    }
}
