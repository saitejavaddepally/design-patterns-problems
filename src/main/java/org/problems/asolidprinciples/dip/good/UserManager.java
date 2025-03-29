package org.problems.asolidprinciples.dip.good;

public class UserManager {
    private Database database;

    public UserManager(Database database) {
        this.database = database;
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
