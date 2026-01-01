package lld.MementoPattern.tryOne;

import java.util.Stack;

public class TextCareTaker {

    private final Stack<TextMemento> mementoStack = new Stack<>();

    public void saveText(TextOriginator text){
        mementoStack.push(text.save());
    }

    public void undo(TextOriginator text){
        if(!mementoStack.isEmpty()){
            TextMemento memento=mementoStack.pop();
            text.restore(memento);
        }
    }


}
