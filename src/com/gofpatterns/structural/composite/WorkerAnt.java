package com.gofpatterns.structural.composite;

public class WorkerAnt implements Buildable {
    @Override
    public void buildNest() {
        System.out.println("Ant is building nest.");
    }
}
