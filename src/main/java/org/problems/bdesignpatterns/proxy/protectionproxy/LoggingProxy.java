package org.problems.bdesignpatterns.proxy.protectionproxy;


// if we want to add another type of proxy

public class LoggingProxy implements Document{

    private Document document;

    public LoggingProxy(Document document){
        this.document = document;
    }

    @Override
    public void display() {
        System.out.println("Logging: Attempting to access the document. ");
        document.display();
        System.out.println("Logging: Access completed.");
    }
}
