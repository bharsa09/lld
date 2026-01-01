package lld.CommandPattern.Problem;

//these are ui buttons

public class BoldButton {

    private TextEditor textEditor;

    public BoldButton(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public void click(){
        textEditor.boldText();
    }

}
