package org.problems.asolidprinciples.srp.bad;


/* * This is a bad example of the Single Responsibility Principle (SRP).
 * This class violates the Single Responsibility Principle (SRP) because it has multiple responsibilities:
 * 1. Managing user data (name and email).
 * 2. Saving user data to a database.
 * 3. Sending emails to users.
 */

public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void saveToDatabase() {
        // Code to save user to database
        System.out.println("Saving user to database: " + name);
    }

    public void sendEmail() {
        // Code to send email
        System.out.println("Sending email to: " + email);
    }
}
