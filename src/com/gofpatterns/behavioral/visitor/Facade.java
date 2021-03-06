package com.gofpatterns.behavioral.visitor;

public class Facade implements Buildable {
    @Override
    public void build(BuildingCompany company) {
        company.build(this);
    }
}
