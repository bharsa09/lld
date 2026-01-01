package lld.FactoryPattern.Problem;

public class TransportService {

    public static void main(String[] args) {
        Transport bike = new Bike();
        Transport car = new Car();
        bike.deliver();
        car.deliver();
    }
}

//problem here is that the client code is directly instantiating the concrete transport classes (Bike and Car).
//This creates a tight coupling between the client code and the concrete implementations,
// making it difficult to add new transport types or change existing ones without modifying the client code.
//To solve this problem, we can use the Factory Design Pattern to encapsulate the instantiation logic and
// provide a way to create transport objects without exposing the creation logic to the client.
