package com.example.factories;

import com.example.classes.MySQL;
import com.example.classes.Oracle;
import com.example.classes.SQLServer;
import com.example.interfaces.ConnectionI;

public class ConnectionFactory {
    public ConnectionI getConnection(String sgbdType) {
        if (sgbdType == null) {
            return null;
        }

        if (sgbdType.equalsIgnoreCase("mysql")) {
            return new MySQL();
        } else if (sgbdType.equalsIgnoreCase("oracle")) {
            return new Oracle();
        } else if (sgbdType.equalsIgnoreCase("sqlserver")) {
            return new SQLServer();
        }

        return null;
    }
}
