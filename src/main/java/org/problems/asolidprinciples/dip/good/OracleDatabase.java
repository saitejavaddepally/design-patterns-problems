package org.problems.asolidprinciples.dip.good;

public class OracleDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to Oracle database...");
    }
}
