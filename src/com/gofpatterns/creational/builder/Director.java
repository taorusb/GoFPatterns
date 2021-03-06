package com.gofpatterns.creational.builder;

public class Director {
    private HumanMentalBuilder mentalBuilder;

    public void setMentalBuilder(HumanMentalBuilder mentalBuilder) {
        this.mentalBuilder = mentalBuilder;
    }

    HumanMentalView buildMental() {
        mentalBuilder.createHuman();
        mentalBuilder.setFaithType();
        mentalBuilder.setLifePosition();
        mentalBuilder.setPoliticType();

        return mentalBuilder.getMentalView();
    }
}
