package lld.ObserverPattern;

public interface Subject {

    void add(Observer ob);
    void remove(Observer ob);
    void notifyObservers();

}
