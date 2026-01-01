package lld.TemplatePattern.Problem;

public class JSONParser {

    public void parse(){
        openFile();
        System.out.println("Parsing JSON File");
        closeFile();
    }

    private void openFile(){
        System.out.println("Opening JSON File");
    }

    private void closeFile(){
        System.out.println("Closing JSON File");
    }
}
