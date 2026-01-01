package lld.MementoPattern.tryOne;

public class TextOriginator {

    private String content="";

    public void write(String text){
        content = content+" "+text;
    }

    public TextMemento save(){
        return new TextMemento(content);
    }

    public void restore(TextMemento memento){
        content = memento.getContent();
    }

    public String getContent(){
        return content;
    }
}
