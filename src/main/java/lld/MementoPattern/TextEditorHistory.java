package lld.MementoPattern;

// Caretaker class to manage the history of TextEditor states
//these are mementos (snapshots of the state)

import java.util.Stack;

public class TextEditorHistory {

    private final Stack<EditorMemento> history = new Stack<>();

    public void saveState(TextEditor editor) {
        history.push(editor.save());
    }

    public void  undo(TextEditor editor) {
        if (!history.isEmpty()) {
            history.pop();
            editor.restore(history.peek());
        }
    }
}
