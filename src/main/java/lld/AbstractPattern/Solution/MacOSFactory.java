package lld.AbstractPattern.Solution;

public class MacOSFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new MacScrollbar();
    }
}
