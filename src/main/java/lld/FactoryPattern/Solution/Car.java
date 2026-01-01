package lld.FactoryPattern.Solution;

public class Car implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by Car");
    }
}
