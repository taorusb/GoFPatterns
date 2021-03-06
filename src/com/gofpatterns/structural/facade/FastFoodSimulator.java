package com.gofpatterns.structural.facade;

public class FastFoodSimulator {
    public static void main(String[] args) {
        FastFood fastFood = new FastFood();
        fastFood.executeOrder("coca-cola", "Cheese bro burger");
    }
}
