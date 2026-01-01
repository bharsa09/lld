package lld.TemplatePattern.Solution;

public class MainApp {

    public static void main(String[] args) {
        DataParser jsonParser = new JSONParser();
        jsonParser.parse();

        System.out.println();

        DataParser csvParser = new CSVParser();
        csvParser.parse();
    }
}
