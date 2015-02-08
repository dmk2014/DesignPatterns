package DriveSim.Strategy;

public class EnhancedEngine implements IEngineBehaviour {
    @Override
    public void start() {
        System.out.println("Enhanced engine is purring on all cylinders!");
    }

    @Override
    public void stop() {
        System.out.println("Enhanced engine is stopped.");
    }
}