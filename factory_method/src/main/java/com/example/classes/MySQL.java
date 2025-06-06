package com.example.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.example.interfaces.ConnectionI;

public class MySQL implements ConnectionI {

    @Override
    public Connection connect(String database, String username, String password)
            throws SQLException, ClassNotFoundException {

        // Etablir la connexion
        String url = "jdbc:mysql://localhost:3307/" + database;
        return DriverManager.getConnection(url, username, password);

    }

}
