package lld.CommandPattern.Solution;

public class MainClass {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        Button button = new Button();

        Command boldCommand = new BoldCommand(textEditor);
        button.setCommand(boldCommand);
        button.click();


        Command italicCommand = new ItalicCommand(textEditor);
        button.setCommand(italicCommand);
        button.click();


        Command underlineCommand = new UnderlineCommand(textEditor);
        button.setCommand(underlineCommand);
        button.click();

    }
}

//one button can perform multiple operations
//button click -> command execute -> textEditor method called
// decoupling the sender and receiver
//sender -> button
//receiver -> textEditor
//command -> bold, italic , underline
//Invoker -> button
//Client -> main class


