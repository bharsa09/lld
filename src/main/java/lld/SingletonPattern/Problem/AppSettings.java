package lld.SingletonPattern.Problem;

public class AppSettings {

    private String databaseURL;
    private String apiKey;

    public AppSettings(){
        this.databaseURL="jdbc:mysql://localhost:3306/mydb";
        this.apiKey="12345-ABCDE";
    }

    public String getDatabaseURL() {
        return databaseURL;
    }
    public String getApiKey() {
        return apiKey;
    }

}
