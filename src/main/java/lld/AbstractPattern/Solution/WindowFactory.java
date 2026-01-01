package lld.AbstractPattern.Solution;

public class WindowFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new WindowsScrollbar();
    }
}
