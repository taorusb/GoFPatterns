package com.gofpatterns.structural.composite;

public class MaleAnt implements Buildable {
    @Override
    public void buildNest() {
        System.out.println("Male ant is building nest.");
    }
}
