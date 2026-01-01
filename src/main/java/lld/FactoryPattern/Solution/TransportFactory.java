package lld.FactoryPattern.Solution;

public class TransportFactory {

    public static Transport createTransport(String type) {
        return switch (type.toLowerCase()) {
            case "car" -> new Car();
            case "bike" -> new Bike();
            case "truck" -> new Truck();
            default -> throw new IllegalArgumentException("Unknown transport type: " + type);
        };
    }
}
