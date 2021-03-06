package com.gofpatterns.creational.builder;

public class Client {
    public static void main(String[] args) {

        Director director = new Director();

        director.setMentalBuilder(new HumanTwoBuilder());
        HumanMentalView humanMentalView = director.buildMental();

        System.out.println(humanMentalView);
    }
}
