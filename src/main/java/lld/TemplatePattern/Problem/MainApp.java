package lld.TemplatePattern.Problem;

public class MainApp {
    public static void main(String[] args) {
        JSONParser jsonParser = new JSONParser();
        jsonParser.parse();

        System.out.println();

        CSVParser csvParser = new CSVParser();
        csvParser.parse();
    }
}
