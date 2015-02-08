package DriveSim.Template;

public class ExperiencedDriver extends Driver {
    public ExperiencedDriver(String name){
        super(name);
    }

    @Override
    void accelerate() {
        System.out.println("Experienced driver is in control!");
        car.accelerate();
    }

    @Override
    void brake() {
        System.out.println("Experienced driver is bringing the car to a safe stop!");
        car.brake();
    }
}