package com.mohammedsebaa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Démonstration de l'interpréteur SQL simplifié
        // Création du contexte et des tables
        DatabaseContext context = new DatabaseContext();

        // Table users
        List<Map<String, Object>> users = new ArrayList<>();
        Map<String, Object> user1 = new HashMap<>();
        user1.put("id", 1);
        user1.put("name", "Alice");
        user1.put("age", 22);
        users.add(user1);
        Map<String, Object> user2 = new HashMap<>();
        user2.put("id", 2);
        user2.put("name", "Bob");
        user2.put("age", 17);
        users.add(user2);
        context.addTable("users", users);

        // Table products
        List<Map<String, Object>> products = new ArrayList<>();
        Map<String, Object> prod1 = new HashMap<>();
        prod1.put("id", 1);
        prod1.put("name", "Stylo");
        prod1.put("price", 10);
        products.add(prod1);
        Map<String, Object> prod2 = new HashMap<>();
        prod2.put("id", 2);
        prod2.put("name", "Cahier");
        prod2.put("price", 60);
        products.add(prod2);
        context.addTable("products", products);

        // 1. SELECT id FROM users
        System.out.println("Résultat: SELECT id FROM users");
        SelectExpression selectIdFromUsers = new SelectExpression(
                new ColumnExpression(List.of("id")),
                new TableExpression("users"));
        System.out.println(selectIdFromUsers.execute(context));

        // 2. SELECT name FROM users WHERE age > 18
        System.out.println("\nRésultat: SELECT name FROM users WHERE age > 18");
        SelectExpression selectNameFromUsersWhereAge = new SelectExpression(
                new ColumnExpression(List.of("name")),
                new TableExpression("users"),
                new WhereExpression(
                        new TableExpression("users"),
                        new ComparisonExpression("age", ">", 18)));
        System.out.println(selectNameFromUsersWhereAge.execute(context));

        // 3. SELECT * FROM products WHERE price < 50
        System.out.println("\nRésultat: SELECT * FROM products WHERE price < 50");
        SelectExpression selectAllFromProductsWherePrice = new SelectExpression(
                new ColumnExpression(List.of("*")),
                new TableExpression("products"),
                new WhereExpression(
                        new TableExpression("products"),
                        new ComparisonExpression("price", "<", 50)));
        System.out.println(selectAllFromProductsWherePrice.execute(context));
    }
}