package org.problems.asolidprinciples.ocp.good;

/**
 * AreaCalculator class that calculates the area of different shapes.
 * This class is open for extension but closed for modification.
 * It can work with any shape that implements the Shape interface.
 */

public class AreaCalculator {
    public double calculateArea(Shape shape){
        return shape.getArea();
    }
}
