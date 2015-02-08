package DriveSim.Template;

import DriveSim.Composite.GameComponent;
import DriveSim.Vehicles.Car;

public abstract class Driver extends GameComponent{
    String name;
    Car car;

    public Driver(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public final void drive(Car car){
        this.car = car;

        startCar();
        accelerate();
        brake();
        stopCar();
    }

    void startCar(){
        car.startEngine();
    }

    abstract void accelerate();

    abstract void brake();

    void stopCar(){
        car.stopEngine();
    }

    public void print() {
        System.out.println("Driver Type: " + getClass().getSimpleName() +
                        "\nDriver Name: " + getName() +
                        "\n"
        );
    }
}