package lld.AbstractPattern.Problem;

public class Application {

    public static void main(String[] args) {
        // For Windows
        WindowsButton winButton = new WindowsButton();
        WindowsScrollbar winScrollbar = new WindowsScrollbar();
        winButton.render();
        winScrollbar.Scroll();

        // For Mac
        MacButton macButton = new MacButton();
        MacScrollbar macScrollbar = new MacScrollbar();
        macButton.render();
        macScrollbar.scroll();
    }
}

//here the Application class is tightly coupled with specific OS components (Windows and Mac).
//This makes it difficult to add support for new operating systems or change existing ones without modifying the Application class itself.
//This violates the Open/Closed Principle, as the class is not closed for modification.
//To improve this design, we could introduce abstract interfaces for Buttons and Scrollbars,
//and have concrete implementations for each OS implement these interfaces. This way, the Application class would depend on abstractions rather than concrete implementations.

