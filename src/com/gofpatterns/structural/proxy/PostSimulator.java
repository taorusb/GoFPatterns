package com.gofpatterns.structural.proxy;

public class PostSimulator {
    public static void main(String[] args) {
        ProxyPostalDelivery delivery = new ProxyPostalDelivery("Indonesia, Bali, Tabanan, Jalan Kamboja");
        delivery.shipCargo();
    }
}
