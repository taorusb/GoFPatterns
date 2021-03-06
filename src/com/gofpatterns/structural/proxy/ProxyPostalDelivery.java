package com.gofpatterns.structural.proxy;

public class ProxyPostalDelivery implements Cargo {

    private String destination;
    private PostalDelivery delivery;

    public ProxyPostalDelivery(String destination) {
        this.destination = destination;
    }

    @Override
    public void shipCargo() {
        if (delivery == null) {
            delivery = new PostalDelivery(destination);
        }
        delivery.shipCargo();
    }
}
