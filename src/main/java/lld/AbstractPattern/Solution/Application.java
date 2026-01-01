package lld.AbstractPattern.Solution;

public class Application {

    private Button button;
    private ScrollBar scrollBar;

    public Application(UIFactory uiFactory) {
        this.button = uiFactory.createButton();
        this.scrollBar = uiFactory.createScrollBar();
    }

    public void render() {
        button.render();
        scrollBar.scroll();
    }

    public static void main(String[] args) {

        UIFactory uiFactory=new MacOSFactory();
        Application app=new Application(uiFactory);  //this is client we do not know which ui factory is being used hence we depend on abstraction
        app.render();

    }
}

//here we have implemented abstract factory design pattern
//here UIFactory is abstract factory
//MacOSFactory and WindowFactory are concrete factories
//Button and ScrollBar are abstract products
//MacButton,WindowsButton,MacScrollbar,WindowsScrollbar are concrete products
//now the Application class depends on abstraction(UIFactory,Button,ScrollBar) rather than concrete implementations(MacOSFactory,WindowFactory,MacButton,WindowsButton,MacScrollbar,WindowsScrollbar)
//now if we want to add support for new operating systems we just need to create new concrete factory
//and concrete products without modifying the Application class
