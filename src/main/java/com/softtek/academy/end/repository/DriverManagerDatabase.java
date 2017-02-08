package com.softtek.academy.end.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DriverManagerDatabase {

    static {
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecomDB", "mmurillo", "mmurillo");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

}

