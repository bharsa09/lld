package lld.StatePattern.Solution;

public class CyclingMode implements State{

    @Override
    public void getDirection() {
        System.out.println("Getting cycling directions...");
    }

    @Override
    public void getETA() {
        System.out.println("Calculating ETA for cycling...");
    }

}
