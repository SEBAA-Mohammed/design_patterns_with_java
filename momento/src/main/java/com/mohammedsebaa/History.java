package com.mohammedsebaa;

import java.util.Stack;

public class History {
    private Stack<EditorMemento> undoStack = new Stack<>();
    private Stack<EditorMemento> redoStack = new Stack<>();

    public void save(EditorMemento memento) {
        undoStack.push(memento);
    }

    public EditorMemento undo(EditorMemento current) {
        if (!undoStack.isEmpty()) {
            redoStack.push(current);
            return undoStack.pop();
        }
        return current;
    }

    public EditorMemento redo(EditorMemento current) {
        if (!redoStack.isEmpty()) {
            undoStack.push(current);
            return redoStack.pop();
        }
        return current;
    }

    public void clearRedo() {
        redoStack.clear();
    }
}
