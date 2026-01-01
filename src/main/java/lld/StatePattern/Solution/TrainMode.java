package lld.StatePattern.Solution;

public class TrainMode implements State{

    @Override
    public void getDirection() {
        System.out.println("Getting train directions...");
    }

    @Override
    public void getETA() {
        System.out.println("Calculating ETA for train...");
    }
}
