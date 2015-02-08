package DriveSim.Strategy;

public class TurboEngine implements IEngineBehaviour {
    @Override
    public void start() {
        System.out.println("Turbo engine is roaring on all cylinders!");
    }

    @Override
    public void stop() {
        System.out.println("Turbo engine is stopped.");
    }
}