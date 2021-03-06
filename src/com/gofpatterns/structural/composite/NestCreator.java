package com.gofpatterns.structural.composite;

public class NestCreator {
    public static void main(String[] args) {

        Buildable ant1 = new WorkerAnt();
        Buildable ant2 = new MaleAnt();

        AntColony nest = new AntColony();

        nest.addAnt(ant1);
        nest.addAnt(ant2);

        nest.buildNest();
    }
}
