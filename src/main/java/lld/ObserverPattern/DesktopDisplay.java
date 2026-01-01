package lld.ObserverPattern;

public class DesktopDisplay implements Observer{
    @Override
    public void update(float temperature) {
        System.out.println("Desktop Display: Temperature updated to "+temperature+" degree Celsius");
    }
}
