package com.gofpatterns.behavioral.visitor;

public interface BuildingCompany {
    void build(Facade facade);
    void build(Foundation foundation);
    void build(Building building);
}
