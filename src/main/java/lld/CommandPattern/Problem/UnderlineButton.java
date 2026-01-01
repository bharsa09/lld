package lld.CommandPattern.Problem;

public class UnderlineButton {

    private TextEditor textEditor;

    public UnderlineButton(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public void click(){
        textEditor.underlineText();
    }
}
