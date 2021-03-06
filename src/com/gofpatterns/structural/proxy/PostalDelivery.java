package com.gofpatterns.structural.proxy;

public class PostalDelivery implements Cargo {

    private String destination;

    public PostalDelivery(String destination) {
        this.destination = destination;
    }

    @Override
    public void shipCargo() {
        System.out.println("Postal Service shipped cargo to " + destination);
    }
}
