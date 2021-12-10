package com.solvd.financialIntitution.db;

import com.solvd.financialIntitution.user.User;

import java.util.concurrent.CompletableFuture;

public class ConnectionPool extends CompletableFuture<User> {
    private static ConnectionPool connectionPool;
    private final String DB = "database";

    private ConnectionPool() {
    }

    public static synchronized ConnectionPool getInstance(){
        if (connectionPool == null) {
            connectionPool = new ConnectionPool();
            return connectionPool;
        }
        return connectionPool;
    }

    private String connectionDone(){
        return "Connection done!";
    }
    private String connectionCancelled(){
        return "Connection cancelled!";
    }
}
