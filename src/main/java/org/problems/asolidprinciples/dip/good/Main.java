package org.problems.asolidprinciples.dip.good;

public class Main {
    public static void main(String[] args) {
        // Using MySQL database
        Database mySQLDatabase = new MySQLDatabase();
        mySQLDatabase.connect();

        // Using Oracle database
        Database oracleDatabase = new OracleDatabase();
        oracleDatabase.connect();
    }
}
