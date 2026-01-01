package lld.StatePattern.Solution;

public class MainClass {

    public static void main(String[] args) {

        State carMode = new CarMode();
        State trainMode = new TrainMode();
        State walkMode = new WalkingMode();
        DirectionService directionService = new DirectionService();

        directionService.setMode(trainMode);
        directionService.getDirection();
        directionService.getETA();

        directionService.setMode(walkMode);
        directionService.getDirection();
        directionService.getETA();

    }
}
