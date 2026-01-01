package lld.StatePattern.Solution;

public class WalkingMode implements State{
    @Override
    public void getDirection() {
        System.out.println("Getting walking directions...");
    }

    @Override
    public void getETA() {
        System.out.println("Calculating ETA for walking...");
    }
}
