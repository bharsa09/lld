package lld.StatePattern.Solution;

public class CarMode implements State{
    @Override
    public void getDirection() {
        System.out.println("Getting driving directions...");
    }

    @Override
    public void getETA() {
        System.out.println("Calculating ETA for driving...");
    }
}
