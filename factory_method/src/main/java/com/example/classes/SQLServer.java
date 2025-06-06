package com.example.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.example.interfaces.ConnectionI;

public class SQLServer implements ConnectionI {

    @Override
    public Connection connect(String database, String username, String password) throws SQLException, ClassNotFoundException{

        // Etablir la connexion avec encryption activee
        String url = "jdbc:sqlserver://localhost:1433;databaseName=" + database;
        
        Properties props = new Properties();
        props.setProperty("user", username);
        props.setProperty("password", password);
        props.setProperty("encrypt", "true");
        props.setProperty("trustServerCertificate", "true");

        return DriverManager.getConnection(url, props);
    }
}