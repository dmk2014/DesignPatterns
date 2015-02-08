package DriveSim.Template;

public class NoobDriver extends Driver {
    public NoobDriver(String name) {
        super(name);
    }

    @Override
    void accelerate() {
        System.out.println("Noob driver is accelerating nervously!");
        car.accelerate();
    }

    @Override
    void brake() {
        System.out.println("Noob driver is struggling to control the car and brakes!");
        car.brake();
    }
}