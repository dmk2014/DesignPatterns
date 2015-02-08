package DriveSim.State;

import DriveSim.Vehicles.Car;

public class OffState implements State {
    Car car;

    public OffState(Car car) {
        this.car = car;
    }

    @Override
    public void turnKeyToStart() {
        car.getEngine().start();
        car.setState(car.getOnState());
    }

    @Override
    public void accelerate() {
        System.out.println("You can't accelerate when the car is off!");
    }

    @Override
    public void brake() {
        System.out.println("You can't brake when the car is off!");
    }

    @Override
    public void turnKeyToStop() {
        System.out.println("You can't turn off a car that isn't started!");
    }
}