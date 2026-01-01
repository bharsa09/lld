package lld.CommandPattern.Problem;

public class MainClass {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        BoldButton boldButton = new BoldButton(textEditor);
        ItalicButton italicButton = new ItalicButton(textEditor);
        UnderlineButton underlineButton = new UnderlineButton(textEditor);

        boldButton.click();
        italicButton.click();
        underlineButton.click();
    }
}

//The problem is here that if we want to add a new feature like "strike through",
// we will have to create a new method in TextEditor class and a new button class StrikeThroughButton.
// This violates the Open/Closed Principle as we are modifying existing classes to add new functionality.
