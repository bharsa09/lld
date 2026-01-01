package lld.MementoPattern.tryOne;

public class TextEditorMain {

    public static void main(String[] args) {
        TextOriginator text=new TextOriginator();
        TextCareTaker careTaker=new TextCareTaker();

        text.write("Hello World");
        careTaker.saveText(text);
        System.out.println("Current Text: "+text.getContent());

        text.write("Hello Java World");
        careTaker.saveText(text);
        System.out.println("Current Text: "+text.getContent());

        text.write("Hello Design Patterns");
        System.out.println("Current Text: "+text.getContent());

        careTaker.undo(text);
        System.out.println("After Undo Text: "+text.getContent());

    }
}
