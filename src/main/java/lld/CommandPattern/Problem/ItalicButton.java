package lld.CommandPattern.Problem;

public class ItalicButton {

    private TextEditor textEditor;

    public ItalicButton(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public void click(){
        textEditor.italicText();
    }
}
