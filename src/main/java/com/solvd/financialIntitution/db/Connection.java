package com.solvd.financialIntitution.db;

public class Connection implements Runnable{


    public Connection() {
    }

    @Override
    public void run() {
        System.out.println(pingDB());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(auth());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(executeQuery());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
