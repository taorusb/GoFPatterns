package com.gofpatterns.creational.builder;

public class HumanOneBuilder extends HumanMentalBuilder {
    @Override
    void setLifePosition() {
        getMentalView().setLifePosition(LifePositionTypes.OPTIMIST.name());
    }

    @Override
    void setPoliticType() {
        getMentalView().setPoliticalView(PoliticalTypes.LIBERAL.name());
    }

    @Override
    void setFaithType() {
        getMentalView().setFaithType(FaithTypes.BUDDHIST.name());
    }
}
