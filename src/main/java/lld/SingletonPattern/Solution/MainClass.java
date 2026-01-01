package lld.SingletonPattern.Solution;

public class MainClass {

    public static void main(String[] args) {
        AppSettings settings1 = AppSettings.getInstance();
        AppSettings settings2 = AppSettings.getInstance();

        System.out.println("Settings 1 DB URL: " + settings1.getDatabaseURL());
        System.out.println("Settings 2 DB URL: " + settings2.getDatabaseURL());

        System.out.println("Are both settings instances the same? " + (settings1 == settings2));
    }
}
