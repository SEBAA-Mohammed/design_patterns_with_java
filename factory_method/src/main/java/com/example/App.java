package com.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.example.factories.ConnectionFactory;
import com.example.interfaces.ConnectionI;

public class App {
    public static void main(String[] args) {
        // creation de la factory
        ConnectionFactory factory = new ConnectionFactory();

        try {
            // Test de connexion MySQL
            System.out.println("Test de connexion MySQL:");
            testConnection(factory, "MySQL", "testdb", "root", "");

            // Test de connexion SQL Server
            System.out.println("\nTest de connexion SQL Server:");
            testConnection(factory, "SQLSERVER", "factory_method", "SA", "tp02_spring_boot");

        } catch (Exception e) {
            System.out.println("Erreur: " + e.getMessage());
            e.printStackTrace();
        }

    }

    private static void testConnection(ConnectionFactory factory, String sgbdType, String database, String username, String password)
    {
        try{
            // Obtenir la connexion via la factory
            ConnectionI connectionInterface = factory.getConnection(sgbdType);
            if(connectionInterface != null) {
                Connection connection = connectionInterface.connect(database, username, password);

                if(connection != null) {
                    System.out.println("Connection reussie a : " + sgbdType);

                    // Executer d'une requete SELECT
                    Statement stmt = connection.createStatement();
                    ResultSet rs = stmt.executeQuery("SELECT id, name from users");
                    
                    // Afficher les resultats
                    System.out.println("Resultats de la requete:");
                    while (rs.next()) {
                        String nom = rs.getString("id");
                        String prenom = rs.getString("name");
                        System.out.println(prenom + " " + nom);
                        System.out.println("----------------");
                    }

                    // Fermer les ressources
                    rs.close();
                    stmt.close();
                    connection.close();
                }
            }else{
                System.out.println("Type de SGBD non supporte: " + sgbdType); 
            }
                
        }catch(Exception e) {
            System.out.println("Erreur lors de la connexion a " + sgbdType + ": " + e.getMessage());
        }
    }
}
