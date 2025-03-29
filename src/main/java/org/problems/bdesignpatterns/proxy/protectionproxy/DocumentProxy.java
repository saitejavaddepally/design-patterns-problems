package org.problems.bdesignpatterns.proxy.protectionproxy;

public class DocumentProxy implements Document {

    private RealDocument realDocument;
    private String content;
    private String userRole;

    public DocumentProxy (String content, String userRole){
        this.content = content;
        this.userRole = userRole;
    }

    @Override
    public void display() {
        if ("ADMIN".equals(userRole)){

            if (realDocument == null){
                realDocument = new RealDocument(content);
            }
            realDocument.display();
        }
        else{
            System.out.println("Access denied invalid permissions");
        }
    }
}
