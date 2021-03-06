package com.gofpatterns.creational.prototype;

public class CellDivisionExecutor {
    public static void main(String[] args) {
        Cell cell = new Cell("neuron");
        System.out.println(cell);
        CellFactory cellFactory = new CellFactory(cell);
        Cell newCell = cellFactory.divideCell();
        System.out.println(newCell);
    }
}
