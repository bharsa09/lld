package lld.CommandPattern.Solution;

public class ItalicCommand implements Command{

    TextEditor textEditor;

    public ItalicCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.italicText();
    }
}
