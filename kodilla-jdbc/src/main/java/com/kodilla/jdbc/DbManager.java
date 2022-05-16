package com.kodilla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbManager {

    private Connection conn;
    private static DbManager dbManagerInstance; // [2]

    private DbManager() throws SQLException {                                              // [3]
        Properties connectionProps = new Properties();          // [4]
        connectionProps.put("user", "kodilla_user");            // [5]
        connectionProps.put("password", "kodilla_password");     // [6]
        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/task_crud" +
                        "?serverTimezone=Europe/Warsaw" +
                        // "&useSSL=False" +
                        "&allowPublicKeyRetrieval=true",                                  // [10]
                connectionProps);                                 // [11]         // [14]
    }                                                          // [15]

    public static DbManager getInstance() throws SQLException{                    // [16]
        if (dbManagerInstance == null){
            dbManagerInstance= new DbManager();
        }
        return dbManagerInstance;
    }                                                          // [18]

    public Connection getConnection() throws SQLException{                        // [19]
        return conn;                                            // [20]
    }
    // [21]
}