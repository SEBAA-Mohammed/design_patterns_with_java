package com.mohammedsebaa;

public class TextEditor {
    private String texte = "";

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public String getTexte() {
        return texte;
    }

    public EditorMemento createMemento() {
        return new EditorMemento(texte);
    }

    public void restore(EditorMemento memento) {
        this.texte = memento.getTexte();
    }
}
