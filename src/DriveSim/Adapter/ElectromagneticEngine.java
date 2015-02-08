package DriveSim.Adapter;

public class ElectromagneticEngine implements IExperimentalEngine{
    @Override
    public void powerOn() {
        System.out.println("Electromagnetic propulsion system engaged!");
    }

    @Override
    public void powerOff() {
        System.out.println("Electromagnetic propulsion system disengaged!");
    }
}