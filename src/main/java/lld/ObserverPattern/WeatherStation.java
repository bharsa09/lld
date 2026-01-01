package lld.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

    List<Observer> observers;

    private float temperature;

    public WeatherStation(){
        observers=new ArrayList<>();
    }

    public void setTemperature(float temperature){
        this.temperature=temperature;
        notifyObservers();
    }

    @Override
    public void add(Observer ob) {
        observers.add(ob);
    }

    @Override
    public void remove(Observer ob) {
        observers.remove(ob);
    }

    @Override
    public void notifyObservers() {
        for(Observer ob:observers){
            ob.update(temperature); // will use run time polymorphism
        }
    }
}
