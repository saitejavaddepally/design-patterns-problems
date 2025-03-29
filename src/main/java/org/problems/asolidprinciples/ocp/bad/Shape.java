package org.problems.asolidprinciples.ocp.bad;


/**
 * This class violates the Open/Closed Principle (OCP) because it requires modification
 * to add new shapes. If we want to add a new shape, we need to modify this class.
 */

public class Shape {
    private int type; // 1 for rectangle, 2 for circle
    private int width;
    private int height;
    private int radius;

    public Shape(int type, int width, int height, int radius) {
        this.type = type;
        this.width = width;
        this.height = height;
        this.radius = radius;
    }

    public double getArea() {
        if (type == 1) {
            return width * height;
        } else if (type == 2) {
            return Math.PI * radius * radius;
        }
        return 0;
    }
}
