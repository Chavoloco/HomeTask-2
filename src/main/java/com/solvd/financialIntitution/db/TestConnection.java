package com.solvd.financialIntitution.db;

import java.util.concurrent.CompletableFuture;

public class TestConnection {
    public static void main(String[] args) {
        ConnectionPool connectionPool = ConnectionPool.getInstance();

        Connection conn1 = connectionPool.getConnection();

        CompletableFuture<Void> uCompletableFuture = CompletableFuture
                .supplyAsync(() -> ConnectionPool.getInstance().getConnection()).thenAccept(c->c.run());




    }
}
