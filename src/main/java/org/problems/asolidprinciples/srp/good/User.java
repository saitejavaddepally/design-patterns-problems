package org.problems.asolidprinciples.srp.good;


/**
 * User class represents a user in the system.
 * It adheres to the Single Responsibility Principle (SRP) by focusing on a single responsibility:
 * managing user-related data such as name and email.
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

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

