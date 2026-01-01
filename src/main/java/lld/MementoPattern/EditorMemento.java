package lld.MementoPattern;

// Memento class to store the internal state of the TextEditor

public class EditorMemento {

    private final String content; // Immutable state. Why? ==> Because we don't want it to be changed once created.

    public EditorMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }



}
