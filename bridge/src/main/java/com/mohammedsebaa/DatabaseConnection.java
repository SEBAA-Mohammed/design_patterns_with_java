package com.mohammedsebaa;

import java.sql.*;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private Connection connection;

    private static final String URL = "jdbc:mysql://localhost:3307/banque";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private DatabaseConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("Error connecting to the database", e);
        }
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    public void creerCompte(Long id, String type, Double soldeInitial) throws SQLException {
        String sql = "INSERT INTO comptes (id, type, solde) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, id);
            stmt.setString(2, type);
            stmt.setDouble(3, soldeInitial);
            stmt.executeUpdate();
        }
    }

    public void enregistrerOperation(Long compteId, String typeOperation, Double montant) throws SQLException {
        String sql = "INSERT INTO operations (compte_id, type_operation, montant) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, compteId);
            stmt.setString(2, typeOperation);
            stmt.setDouble(3, montant);
            stmt.executeUpdate();
        }
    }

    public void mettreAJourSolde(Long compteId, Double nouveauSolde) throws SQLException {
        String sql = "UPDATE comptes SET solde = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setDouble(1, nouveauSolde);
            stmt.setLong(2, compteId);
            stmt.executeUpdate();
        }
    }
}