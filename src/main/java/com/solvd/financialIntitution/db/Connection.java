package com.solvd.financialIntitution.db;

public class Connection extends Thread {

    private  Boolean isOpen;

    public Connection() {
        this.isOpen = true;
    }

    @Override
    public void run() {
        System.out.println(pingDB());
        System.out.println(auth());
        System.out.println(executeQuery());
        System.out.println(close());
    }

    public Boolean getOpen() {
        return isOpen;
    }

    public void setOpen(Boolean open) {
        isOpen = open;
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
