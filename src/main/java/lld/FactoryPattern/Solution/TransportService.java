package lld.FactoryPattern.Solution;

public class TransportService {

    public static void main(String[] args) {
        Transport car = TransportFactory.createTransport("car");
        car.deliver();

        Transport bike=TransportFactory.createTransport("bike");
        bike.deliver();

        Transport truck=TransportFactory.createTransport("truck");
        truck.deliver();
    }
}
