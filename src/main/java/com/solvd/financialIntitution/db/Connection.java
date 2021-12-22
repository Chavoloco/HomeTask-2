package com.solvd.financialIntitution.db;

public class Connection extends Thread {


    public Connection() {
    }

    @Override
    public void run() {
        System.out.println(pingDB());
        System.out.println(auth());
        System.out.println(executeQuery());
        System.out.println(close());
    }


    private String pingDB() {
        return "ping DB";
    }

    private String auth() {
        return "auth";
    }

    private String executeQuery() {
        return "executing query";
    }

    private String close() {
        return "close";
    }
}
