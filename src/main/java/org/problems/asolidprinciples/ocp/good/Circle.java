package org.problems.asolidprinciples.ocp.good;

/**
 * Circle class that implements the Shape interface.
 * This class is open for extension but closed for modification.
 */
// This means we can add new shapes by creating new classes that implement the Shape interface
public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
