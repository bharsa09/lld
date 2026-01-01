package lld.StatePattern.Solution;

public class DirectionService {

    private State currentState;

    public DirectionService() {
        // Default mode
        this.currentState = new CarMode();
    }

    public void setMode(State state) {
        this.currentState = state;
    }

    public void getDirection() {
        currentState.getDirection();
    }

    public void getETA() {
        currentState.getETA();
    }

}
