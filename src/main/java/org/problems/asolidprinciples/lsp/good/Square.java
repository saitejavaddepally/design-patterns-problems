package org.problems.asolidprinciples.lsp.good;

public class Square implements Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
