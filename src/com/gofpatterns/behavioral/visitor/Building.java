package com.gofpatterns.behavioral.visitor;

public class Building implements Buildable {
    @Override
    public void build(BuildingCompany company) {
        company.build(this);
    }
}
