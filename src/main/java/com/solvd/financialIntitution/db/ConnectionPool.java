package com.solvd.financialIntitution.db;

import com.solvd.financialIntitution.user.User;


public class ConnectionPool {
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

    private static String connectionDone(){
        return "Connection done!";
    }
    private static String connectionCancelled(){
        return "Connection cancelled!";
    }

    public static String connect(User user){
            if (user.getUserName().equals("admin") && user.getPassword().equals("admin")){
                return connectionDone();
            }else {
                return connectionCancelled();
            }
    }
}
