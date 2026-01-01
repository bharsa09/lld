package lld.StatePattern.Problem;

public class MainClass {

    public static void main(String[] args) {
        DirectionService directionService = new DirectionService();
        directionService.setTransportationMode(TransportationMode.WALKING);
        directionService.getDirections("Point A", "Point B");
        directionService.getETA("Point A", "Point B");
    }
}

//the problem with above code is that if we want to add new transportation mode we have to modify
// the DirectionService class which is against the open closed principle.
//Also the DirectionService class has too many responsibilities like getting directions and calculating ETA for different transportation modes.
// This can lead to code that is hard to maintain and extend.
//To solve these problems we can use the State Design Pattern to encapsulate the behavior associated with each transportation mode into separate classes.

