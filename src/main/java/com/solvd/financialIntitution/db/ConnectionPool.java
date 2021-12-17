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

    public synchronized Connection connect() throws InterruptedException {
        Connection connection = new Connection();
        if (connections.size() >= MAX_CONNECTIONS) {
            log.error("Connection pool is full");
            return connection;
        } else {
            connection.setName("connection" + connections.size());
            log.info("connection runs " + connection.getName());
            connections.add(connection);
            connection.run();
            connection.setOpen(false);
            return connection;
        }
    }

    public List<Connection> getConnections() {
        return connections;
    }
}
