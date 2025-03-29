package org.problems.asolidprinciples.lsp.bad;

public class Square extends Rectangle{

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.height = width; // Square's width and height are always equal
    }

    @Override
    public void setHeight(double height) {
        this.width = height;
        this.height = height; // Square's width and height are always equal
    }

}
