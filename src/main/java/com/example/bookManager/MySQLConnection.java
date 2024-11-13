package com.alexmonzon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {

    private static String url = "jdbc:mysql://localhost:3306/books";
    private static String user = "root";
    private static String password = "";

    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url, user, password);
    }
}
