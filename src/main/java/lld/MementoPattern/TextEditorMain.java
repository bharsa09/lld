package lld.MementoPattern;

public class TextEditorMain {

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        TextEditorHistory history = new TextEditorHistory();
        editor.write("Hello ");
        history.saveState(editor);

        editor.write("World!");
        history.saveState(editor);


        System.out.println(editor.getContent());

        history.undo(editor);
        System.out.println(editor.getContent());

        //problem statement===> we want to undo the last write operation;

    }
}
