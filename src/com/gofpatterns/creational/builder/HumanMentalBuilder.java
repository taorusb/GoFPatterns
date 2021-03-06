package com.gofpatterns.creational.builder;

public abstract class HumanMentalBuilder {
    private HumanMentalView mentalView;

    abstract void setLifePosition();
    abstract void setPoliticType();
    abstract void setFaithType();

    void createHuman() {
        mentalView = new HumanMentalView();
    }

    HumanMentalView getMentalView() {
        return mentalView;
    }
}
