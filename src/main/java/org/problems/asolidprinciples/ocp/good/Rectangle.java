package org.problems.asolidprinciples.ocp.good;

/**
 * Rectangle class that implements the Shape interface.
 * This class is open for extension but closed for modification.
 */
public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
