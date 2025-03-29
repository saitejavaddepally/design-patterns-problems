package org.problems.asolidprinciples.dip.bad;

// This class violates the Dependency Inversion Principle (DIP) because it directly depends on a concrete implementation (MySQLDatabase).

public class UserManager {
    private MySQLDatabase database;

    public UserManager() {
        this.database = new MySQLDatabase();
    }

    public void addUser(String username) {
        database.connect();
        System.out.println("Adding user: " + username);
    }

    public void removeUser(String username) {
        database.connect();
        System.out.println("Removing user: " + username);
    }
}
