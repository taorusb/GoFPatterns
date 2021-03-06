package com.gofpatterns.creational.prototype;

public class Cell implements Divisible {
    private String cellType;

    public Cell(String cellType) {
        this.cellType = cellType;
    }

    public String getCellType() {
        return cellType;
    }

    public void setCellType(String cellType) {
        this.cellType = cellType;
    }

    @Override
    public Object divide() {
        return new Cell(cellType);
    }
}
