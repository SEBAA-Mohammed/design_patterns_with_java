package com.mohammedsebaa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TextEditor editor = new TextEditor();
        History history = new History();
        history.save(editor.createMemento());
        String input;
        System.out.println("Bienvenue dans l'éditeur de texte minimaliste (tapez 'exit' pour quitter)");
        while (true) {
            System.out.print("> Entrez du texte : ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Au revoir !");
                break;
            } else if (input.equalsIgnoreCase("undo")) {
                EditorMemento memento = history.undo(editor.createMemento());
                editor.restore(memento);
                System.out.println("> Texte actuel : " + editor.getTexte());
            } else if (input.equalsIgnoreCase("redo")) {
                EditorMemento memento = history.redo(editor.createMemento());
                editor.restore(memento);
                System.out.println("> Texte actuel : " + editor.getTexte());
            } else {
                editor.setTexte(input);
                history.save(editor.createMemento());
                history.clearRedo();
            }
        }
        scanner.close();
    }
}