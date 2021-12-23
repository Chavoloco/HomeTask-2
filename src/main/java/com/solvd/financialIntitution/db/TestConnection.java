package com.solvd.financialIntitution.db;

import java.util.concurrent.CompletableFuture;

public class TestConnection {
    public static void main(String[] args) {
        Connection connectionPool = ConnectionPool.getInstance().getConnection();

        Connection conn1 = new Connection();

        CompletableFuture<Void> cf = CompletableFuture.runAsync(() -> ConnectionPool.getInstance()
                .returnConnection(conn1)).thenRun(() -> conn1.run());

        while (cf.isDone()){
            
        }


    }
}
