package DriveSim.Strategy;

public class StandardEngine implements IEngineBehaviour {
    @Override
    public void start() {
        System.out.println("Standard engine is ready to drive!");
    }

    @Override
    public void stop() {
        System.out.println("Standard engine is stopped.");
    }
}