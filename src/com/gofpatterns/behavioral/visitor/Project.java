package com.gofpatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Project implements Buildable {

    private List<Buildable> items;

    public Project() {
        items = new ArrayList<>();
        items.add(new Foundation());
        items.add(new Building());
        items.add(new Facade());
    }


    @Override
    public void build(BuildingCompany company) {
        items.forEach(x -> x.build(company));
    }
}
