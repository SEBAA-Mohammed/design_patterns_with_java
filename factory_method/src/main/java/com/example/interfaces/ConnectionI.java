package com.example.interfaces;
import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionI {
    Connection connect(String database, String username, String password) throws SQLException, ClassNotFoundException;
}
