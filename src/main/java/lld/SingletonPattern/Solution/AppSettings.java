package lld.SingletonPattern.Solution;

public class AppSettings {
    private static AppSettings instance;
    private String databaseURL;
    private String apiKey;

    private AppSettings(){
        this.databaseURL="jdbc:mysql://localhost:3306/mydb";
        this.apiKey="12345-ABCDE";
    }

    public static AppSettings getInstance(){
        if(instance==null){
            instance=new AppSettings();
        }
        return instance;
    }
    public String getDatabaseURL() {
        return databaseURL;
    }

    public String getApiKey() {
        return apiKey;
    }
}

//steps to use singleton pattern
//1. private static variable of the same class that is the only instance of the class
//2. private constructor to restrict instantiation of the class from other classes
//3. public static method that returns the instance of the class, this is the global access
