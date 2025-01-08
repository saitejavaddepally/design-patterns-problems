package org.problems.patternlevelapplications.proxy.protectionproxy;

public class ProtectionProxyExample {
    public static void main(String[] args) {
        Document adminDoc = new DocumentProxy("Confidential Report", "ADMIN");
        Document loggingDoc = new LoggingProxy(adminDoc);
        loggingDoc.display(); // Access granted

        Document userDoc = new DocumentProxy("Confidential Report", "USER");
        Document loggingUserDoc = new LoggingProxy(userDoc);
        loggingUserDoc.display(); // Access granted
    }
}
