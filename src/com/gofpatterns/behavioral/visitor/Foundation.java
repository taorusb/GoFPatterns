package com.gofpatterns.behavioral.visitor;

public class Foundation implements Buildable {
    @Override
    public void build(BuildingCompany company) {
        company.build(this);
    }
}
