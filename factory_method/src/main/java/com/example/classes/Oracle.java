package com.example.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.example.interfaces.ConnectionI;

public class Oracle implements ConnectionI {

    @Override
    public Connection connect(String database, String username, String password)
            throws SQLException, ClassNotFoundException {

        // Etablir la connexion
        String url = "jdbc:oracle:thin:@localhost:1521:" + database;
        return DriverManager.getConnection(url, username, password);
    }
}
