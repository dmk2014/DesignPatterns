package DriveSim.Adapter;

public class BiofuelEngine implements IExperimentalEngine {
    @Override
    public void powerOn() {
        System.out.println("Biofuel engine is powering up!");
    }

    @Override
    public void powerOff() {
        System.out.println("Biofuel engine is shutting down!");
    }
}