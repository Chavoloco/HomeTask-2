package com.solvd.financialIntitution.db;

import com.solvd.financialIntitution.Main;
import com.solvd.financialIntitution.user.User;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.*;


public class ConnectionPool {
    private static final Logger log = LogManager.getLogger(Main.class);

    private static ConnectionPool connectionPool;
    private final String DB = "database";
    private static int contAmount = 0;

    private static final int MAX_CONNECTIONS = 5;
    private static List<Connection> connections = new ArrayList<>(MAX_CONNECTIONS);


    private ConnectionPool() {
    }

    public static ConnectionPool getInstance() {
        if (connectionPool == null) {
            connectionPool = new ConnectionPool();
            return connectionPool;
        }
        return connectionPool;
    }

    public synchronized Connection getConnection() {
        if (!connections.isEmpty()) {
            return connections.stream().findFirst().get();
        } else if (contAmount == MAX_CONNECTIONS) {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                    if (!connections.isEmpty()) {
                        return connections.stream().findFirst().get();
                    }
                } catch (InterruptedException e) {
                    log.error("Thread error", e);
                }
            }
            throw new RuntimeException("");
        } else {
            contAmount++;
            return new Connection();
        }
    }

    public synchronized void returnConnection(Connection connection) {
        connections.add(connection);
    }
}

