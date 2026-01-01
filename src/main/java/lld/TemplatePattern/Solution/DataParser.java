package lld.TemplatePattern.Solution;

public abstract class DataParser {

    public final void parse() {
        openFile();
        parseData();
        closeFile();
    }

    protected void openFile() {
        System.out.println("Opening file");
    }
    protected abstract void parseData();

    protected void closeFile() {
        System.out.println("Closing file");
    }

}
