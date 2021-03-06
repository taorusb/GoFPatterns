package com.gofpatterns.creational.singleton;

public class President {
    private static President instance;
    private final String firstName = "Vladimir";
    private final String lastName = "Putin";

    private President(){

    }

    public static President getPresident() {
        if (instance == null) {
            instance = new President();
        }
        return instance;
    }

    public void control() {
        System.out.println(firstName + " " + lastName + " is controlling the government.");
    }
}
