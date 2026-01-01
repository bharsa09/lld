package lld.TemplatePattern.Problem;

public class CSVParser {

    public void parse(){
        openFile();
        System.out.println("Parsing CSV File");
        closeFile();
    }

    private void openFile(){
        System.out.println("Opening CSV File");
    }

    private void closeFile(){
        System.out.println("Closing CSV File");
    }
}

