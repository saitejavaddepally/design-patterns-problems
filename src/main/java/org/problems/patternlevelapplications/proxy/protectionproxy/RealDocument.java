package org.problems.patternlevelapplications.proxy.protectionproxy;

public class RealDocument implements Document{

    String content;

    public RealDocument(String content) {
        this.content = content;
    }

    @Override
    public void display() {
        System.out.println("Displaying content " + content);
    }
}
