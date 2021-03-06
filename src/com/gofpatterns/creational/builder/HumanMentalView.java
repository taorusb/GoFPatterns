package com.gofpatterns.creational.builder;

public class HumanMentalView {
    private String lifePosition;
    private String politicalView;
    private String faithType;

    public String getLifePosition() {
        return lifePosition;
    }

    public void setLifePosition(String lifePosition) {
        this.lifePosition = lifePosition;
    }

    public String getPoliticalView() {
        return politicalView;
    }

    public void setPoliticalView(String politicalView) {
        this.politicalView = politicalView;
    }

    public String getFaithType() {
        return faithType;
    }

    public void setFaithType(String faithType) {
        this.faithType = faithType;
    }

    @Override
    public String toString() {
        return "HumanMentalView{" +
                "lifePosition='" + lifePosition + '\'' +
                ", politicalView='" + politicalView + '\'' +
                ", faithType='" + faithType + '\'' +
                '}';
    }
}
