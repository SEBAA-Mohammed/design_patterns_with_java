package com.mohammedsebaa;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 1234;
        try (Socket socket = new Socket(host, port);
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                Scanner scanner = new Scanner(System.in)) {

            // Utilisation du décorateur
            MessageSender sender = new UpperCaseDecorator(new SimpleMessageSender());

            System.out.println("Connecté au serveur. Tapez vos messages (" + host + ":" + port + ") :");
            while (true) {
                System.out.print("> ");
                String message = scanner.nextLine();
                if (message.equalsIgnoreCase("exit")) {
                    System.out.println("Déconnexion...");
                    break;
                }
                String decorated = sender.decorate(message);
                out.println(decorated);
            }
        } catch (IOException e) {
            System.out.println("Erreur de connexion au serveur : " + e.getMessage());
        }
    }
}