package org.problems.bdesignpatterns.decorator.texteditor;

public class TextDecoratorDemo {
    public static void main(String[] args) {
        Text plainText = new PlainText("Hello, World!");
        Text boldItalicText = new BoldText(new ItalicText(plainText));

        System.out.println(boldItalicText.format());
    }
}
