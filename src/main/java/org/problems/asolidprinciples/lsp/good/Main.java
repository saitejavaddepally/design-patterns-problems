package org.problems.asolidprinciples.lsp.good;

// This is the main class to demonstrate the Liskov Substitution Principle
// and the Open/Closed Principle in action.

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle area: " + rectangle.getArea());

        Shape square = new Square(4);
        System.out.println("Square area: " + square.getArea());
    }
}
