package com.gofpatterns.behavioral.templatemethod;

public abstract class SimulatorOfOrdinaryDay {
    void startTheDay() {
        System.out.println("Step 1: Wake up.");
        System.out.println("Step 2: Leave the house.");
        stepThree();
        System.out.println("Step 4: Get to work.");
        System.out.println("Step 5: Go back home.");
        System.out.println("Step 6: Go to bed.");
    }

    abstract void stepThree();
}
