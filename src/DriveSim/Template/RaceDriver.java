package DriveSim.Template;

public class RaceDriver extends Driver{
    public RaceDriver(String name) {
        super(name);
    }

    @Override
    void accelerate() {
        System.out.println("Race driver is accelerating aggressively!");
        car.accelerate();
    }

    @Override
    void brake() {
        System.out.println("Race driver has slammed on the brakes!");
        car.brake();

    }
}