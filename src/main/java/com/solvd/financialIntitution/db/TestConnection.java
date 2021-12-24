package com.solvd.financialIntitution.db;

import java.util.concurrent.CompletableFuture;

public class TestConnection {
    public static void main(String[] args) {
        ConnectionPool cp = ConnectionPool.getInstance();

        CompletableFuture<Void> thread1 = CompletableFuture
                .supplyAsync(() -> cp.getConnection()).thenAccept(c -> c.run());

        CompletableFuture<Void> thread2 = CompletableFuture
                .supplyAsync(() -> cp.getConnection()).thenAccept(c -> c.run());

        CompletableFuture<Void> thread3 = CompletableFuture
                .supplyAsync(() -> cp.getConnection()).thenAccept(c -> c.run());

        CompletableFuture<Void> thread4 = CompletableFuture
                .supplyAsync(() -> cp.getConnection()).thenAccept(c -> c.run());

        CompletableFuture<Void> thread5 = CompletableFuture
                .supplyAsync(() -> cp.getConnection()).thenAccept(c -> c.run());

        CompletableFuture<Void> thread6 = CompletableFuture
                .supplyAsync(() -> cp.getConnection()).thenAccept(c -> c.run());

        if (thread1.isDone()) {
            Connection conn = cp.getConnection();
            cp.returnConnection(conn);
        }
    }
}
