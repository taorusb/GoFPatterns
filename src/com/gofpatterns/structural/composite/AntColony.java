package com.gofpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class AntColony implements Buildable {

    private List<Buildable> ants = new ArrayList<>();

    public void addAnt(Buildable ant) {
        ants.add(ant);
    }

    public void removeAnt(Buildable ant) {
        ants.remove(ant);
    }


    @Override
    public void buildNest() {
        ants.forEach(Buildable::buildNest);
    }
}
