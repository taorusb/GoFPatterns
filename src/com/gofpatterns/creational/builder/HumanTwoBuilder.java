package com.gofpatterns.creational.builder;

public class HumanTwoBuilder extends HumanMentalBuilder {
    @Override
    void setLifePosition() {
        getMentalView().setLifePosition(LifePositionTypes.PESSIMIST.name());
    }

    @Override
    void setPoliticType() {
        getMentalView().setPoliticalView(PoliticalTypes.COMMUNIST.name());
    }

    @Override
    void setFaithType() {
        getMentalView().setFaithType(FaithTypes.ATHEIST.name());
    }
}
