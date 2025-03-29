package org.problems.asolidprinciples.lsp.bad;

// Rectangle class that violates Liskov Substitution Principle
// by allowing a square to be treated as a rectangle
// but not behaving like one.


public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setWidth(5);
        rect.setHeight(10);
        System.out.println(rect.getArea());

        // Substituting Square for Rectangle
        Rectangle square = new Square();
        square.setWidth(5);
        square.setHeight(10);  // This violates the behavior of a square
        System.out.println(square.getArea()); // Output: 100. Should be 5*5 = 25
    }
}
