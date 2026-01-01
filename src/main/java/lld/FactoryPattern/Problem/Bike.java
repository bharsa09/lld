package lld.FactoryPattern.Problem;

public class Bike implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivering by Bike");
    }
}
