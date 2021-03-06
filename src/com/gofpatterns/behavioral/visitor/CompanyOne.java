package com.gofpatterns.behavioral.visitor;

public class CompanyOne implements BuildingCompany {
    @Override
    public void build(Facade facade) {
        System.out.println("Building company one building facade...");
    }

    @Override
    public void build(Foundation foundation) {
        System.out.println("Building company one building foundation...");
    }

    @Override
    public void build(Building building) {
        System.out.println("Building company one building building...");
    }
}
