package com.solvd.financialIntitution.db;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public class TestConnection {
    public static void main(String[] args) throws InterruptedException {
        ConnectionPool pool = ConnectionPool.getInstance();
        pool.connect();
        pool.connect();
        pool.connect();
        pool.connect();
        pool.connect();
        pool.connect();
        pool.connect();



        //Connection connection1 = pool.connect();
        //Connection connection2 = pool.connect();
        //Connection connection3 = pool.connect();
        //Connection connection4 = pool.connect();
        //Connection connection5 = pool.connect();

        //System.out.println(connection1.getName());
        //System.out.println(connection2.getName());
        //System.out.println(connection3.getName());
        //System.out.println(connection4.getName());
        //System.out.println(connection5.getName());

        //System.out.println(pool.getConnections());
    }
}
