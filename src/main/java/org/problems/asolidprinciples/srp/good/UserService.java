package org.problems.asolidprinciples.srp.good;


/**
 * UserService class is responsible for user-related operations.
 * It adheres to the Single Responsibility Principle (SRP) by focusing on a single responsibility:
 * managing user-related tasks such as sending emails.
 */

public class UserService {
    public void sendEmail(String email, String message) {
        // Code to send email
        System.out.println("Sending email to " + email + ": " + message);
    }
}
