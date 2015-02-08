package DriveSim.Strategy;

public class ManualTransmission implements ITransmissionBehaviour {
    @Override
    public void gearShiftUp() {
        System.out.println("Manually shifting up a gear");
    }

    @Override
    public void gearShiftDown() {
        System.out.println("Manually shifting down a gear");
    }
}