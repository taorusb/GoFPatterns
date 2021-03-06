package com.gofpatterns.creational.prototype;

public class CellFactory {
    private Cell cell;

    public CellFactory(Cell cell) {
        this.cell = cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    Cell divideCell() {
        return (Cell) cell.divide();
    }
}
