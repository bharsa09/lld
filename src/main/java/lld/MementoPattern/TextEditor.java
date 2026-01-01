package lld.MementoPattern;

/* A text editor where the user can undo changes, such as text addition, deletion,
or formatting. The editor stores snapshots of its state (text content)
after each change, enabling the user to revert to previous states.
 */

public class TextEditor {

    private String content;

    public void write(String text) {
        content = text;
    }

    //save the state
    public EditorMemento save() {
        return new EditorMemento(content);
    }

    //restore the state (Memento->update the current state)

    public void restore(EditorMemento memento) {
        this.content = memento.getContent();
    }

    public String getContent() {
        return content;
    }

}
