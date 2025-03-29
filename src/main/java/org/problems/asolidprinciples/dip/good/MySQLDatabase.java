package org.problems.asolidprinciples.dip.good;

public class MySQLDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL database...");
    }
}
