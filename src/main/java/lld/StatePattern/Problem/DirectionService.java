package lld.StatePattern.Problem;

public class DirectionService {

    private TransportationMode currentMode;

    public DirectionService() {
        this.currentMode = TransportationMode.WALKING; // Default mode
    }

    public void setTransportationMode(TransportationMode mode) {
        this.currentMode = mode;
    }

    public void getDirections(String from, String to) {
        switch (currentMode) {
            case WALKING:
                System.out.println("Getting walking directions from " + from + " to " + to);
                break;
            case CYCLING:
                System.out.println("Getting cycling directions from " + from + " to " + to);
                break;
            case CAR:
                System.out.println("Getting driving directions from " + from + " to " + to);
                break;
            case TRAIN:
                System.out.println("Getting train directions from " + from + " to " + to);
                break;
            default:
                System.out.println("Unknown transportation mode");
        }
    }

    public void getETA(String from, String to) {
        switch (currentMode) {
            case WALKING:
                System.out.println("Calculating walking ETA from " + from + " to " + to);
                break;
            case CYCLING:
                System.out.println("Calculating cycling ETA from " + from + " to " + to);
                break;
            case CAR:
                System.out.println("Calculating driving ETA from " + from + " to " + to);
                break;
            case TRAIN:
                System.out.println("Calculating train ETA from " + from + " to " + to);
                break;
            default:
                System.out.println("Unknown transportation mode");
        }
    }
}
