package lld.ObserverPattern;

public class WeatherApplication {

    public static void main(String[] args) {
        WeatherStation ws=new WeatherStation();

        Observer phone=new MobileDisplay();
        Observer window=new DesktopDisplay();
        ws.add(phone);
        ws.add(window);

        ws.setTemperature(19.8f);


        ws.remove(phone);

        ws.setTemperature(12.3f);
    }
}

//Observers are not tightly coupled with the Subject
//We can add/remove observers at runtime
//We can have multiple types of observers
//We can easily extend the system by adding new observer types without changing existing code
//observer are subscribed to the subject and get notified automatically when there is a change in the subject's state
//Subject doesn't need to know the details of observers, it just calls their update method
//SUbject maintains a list of observers and notifies them of state changes
